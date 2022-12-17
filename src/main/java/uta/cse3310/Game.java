package uta.cse3310;
import java.util.Vector;
import uta.cse3310.Event.EventType;
import uta.cse3310.Card;
import uta.cse3310.Deck;
import uta.cse3310.Player;
import uta.cse3310.Dealer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uta.cse3310.Bot;

public class Game {
     Deck D;
     Vector<Card> removedCards; //LT

    Vector<Player> players; //KA
    int currentTurn; //KA
    Dealer dealer; //= new Dealer();
    Bot bot;
    public Game()
    { 
       D = new Deck();
       dealer = new Dealer();
       bot = new Bot();
     //  bot.newStatus = CheckStatus.NORMAL;
       removedCards = new Vector<Card>();
       players =  new Vector<Player>();
       currentTurn = 2;
         //Add a bot and a dealer to the players class
           dealer.pHand.add(0,D.getCard());
           dealer.pHand.add(1,D.getCard());//index 0, playerID 0;    
           players.add(dealer); 

           bot.pHand.add(0,D.getCard());
           bot.pHand.add(1,D.getCard());
           players.add(bot); 
       System.out.println("hey! i am in the Game constructor");
    } 
  /*public static void main(String[] args) {

    S
    
  }*/

  public String exportStateAsJSON() {
    Gson gson = new Gson();
    return gson.toJson(this);
}

  public  void addPlayer(Player P){ /*Created by Kierra Ashford, Last edited by Kierra Ashford */
       
     System.out.println("Player "+ P.playerID+ " Curren Turn is" + currentTurn);
       P.pHand.add(0,D.getCard());
       P.pHand.add(1,D.getCard());
       players.add(P);
       
  }

  public void removePlayer(int indexOfPlayer){
    //Added by Logan Thresher
    for (int i = 0; i < players.elementAt((indexOfPlayer)).pHand.size(); ++i) //Adds every card from the player to the removedCards vector
    {
      removedCards.add(players.elementAt((indexOfPlayer)).pHand.elementAt(i));
    }
    
    players.remove(indexOfPlayer);
  }
  

  public int split(Vector <Card> Hand){
   int index = 1917; 
   for(int i = 0; i< Hand.size(); i++){
  /* if(Hand[i].getValue())== CardSuit.Ten){
          returns index of player's hand to make a bet*
          r
  } */
   }      
return index;
    //splits the card, starts a new bet
  }
  

    public void processMessage(String msg) { /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
    System.out.println(msg);

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    // take the string we just received, and turn it into a user event
    
        Event SomethingHappens = new Event();
    if (msg.contains("HIT")){
              System.out.println("Message Processed as Hit in Game.java");
               
              Update(SomethingHappens.event);
    }
    if(msg.contains("STAND")){
      System.out.println("Message processed as Stand in Game.java");
      SomethingHappens.event = EventType.STAND;
      Update(SomethingHappens.event);
    }
    if(msg.contains("FOLD")){
      SomethingHappens.event = EventType.FOLD;
       Update(SomethingHappens.event);

    }if(msg.contains("HINT")){
     hints(players.get(currentTurn).pHand);
    }
     if(msg.contains("DOUBLE")){
      SomethingHappens.event = EventType.DOUBLE;
      Update(SomethingHappens.event);
     }
     if(msg.contains("SPLIT")){
      SomethingHappens.event = EventType.SPLIT;
      Update(SomethingHappens.event);
     }
     if(msg.contains("BET")){
         int betAmount = Integer.parseInt(msg);
         players.get(currentTurn).amount = betAmount;
           }
    
}
  public static String hints(Vector<Card> Hand){ /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
      //will be fi
      int total = 0;
      int indexReturn =0;
      String hintMessages [] = {"Hit", "Stand", "Double", "Split"};
      total = getHandValue(Hand);
      if(total == 20){
       indexReturn = 3;

     } else if(total >=17){
          indexReturn = 1;
      }

       else if(total <17){
        indexReturn = 0;
      }

      System.out.println(hintMessages[indexReturn]);
      return  hintMessages[indexReturn]; 
  }
public static int getHandValue(Vector<Card> Hand){
  int total = 0;
for(int i = 0; i < Hand.size();i++){
         total+= Card.getCardLiteralValue(Hand.get(i).getCardValue());
      }
      return total;
} 
  //clear the game/reset
  public static Vector<Card> switchHand(Vector<Card> Hand){
          Card card1 = Hand.get(0);
          Card card2 = Hand.get(1);
          int lastElement = Hand.size() - 1;
          int secondToLast = Hand.size()-2;
       Hand.set(0, Hand.get(lastElement));
       Hand.set(1, Hand.get(secondToLast));
       Hand.set(lastElement, card1);
       Hand.set(secondToLast,card2);


           

           return Hand;
  }
public  boolean Update(EventType E){ /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
switch(E){
    case HIT:
      /*  Access Players Vector, Identify current player by currentTurn 
                  Then Accesses the Player's Hand
                   Adds a Card to the Hand 
                        Kierra Ashford                    */
                        
      players.get(currentTurn).pHand.add(D.getCard());
                   players.get(currentTurn).pHand =  switchHand(players.get(currentTurn).pHand);   
      /*Implement Switch Cards method or get javascript to showcase last two cards in a hand*/
        
    break;

    case STAND:

      if(currentTurn  + 1 == players.size()){
        currentTurn = 0;
        EventType dealerChoice;
        dealerChoice = EventType.HIT;
        Update(dealerChoice);
      }else{
      currentTurn = currentTurn+ 1;
      }
    break;

    


    case SPLIT:

         int toBeSplit = split(players.get(currentTurn).pHand);
    break;

    case BET:
              
    break;

    case FOLD:
           removePlayer(currentTurn);  
           
      if(currentTurn  + 1 == players.size()){
        currentTurn = 0;
      }else{   
                 currentTurn = currentTurn++;
      }

    break;
}
return false;

}
  //returns an array of numbers dependent on the wins and losses
  public static int[] declareWin(){
     int winsLoss [] = {1,0,1};
    return winsLoss;
  }
  public static int sendDealeraAmount(){
    return 5000;
  }
  //returns playerID
    public static int determineTurn(){
      int playerOneID = 5684;
      return playerOneID;
    }
  //returns a boolean value for when time is up
  public static boolean timer(){
    return false;
  }
  
  
    
}
