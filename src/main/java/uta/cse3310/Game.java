package uta.cse3310;
import java.util.Vector;
import uta.cse3310.Event.EventType;
import uta.cse3310.Card;
import uta.cse3310.Deck;
import uta.cse3310.Player;
import uta.cse3310.Dealer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Game {
     Deck D = new Deck();
     Vector<Card> removedCards; //LT

    Vector<Player> players; //KA
     int currentTurn; //KA
    Dealer dealer = new Dealer();
   
  /*public static void main(String[] args) {

    S
    
  }*/

  public String exportStateAsJSON() {
    Gson gson = new Gson();
    return gson.toJson(this);
}

  public  void addPlayer(Player P){ /*Created by Kierra Ashford, Last edited by Kierra Ashford */
       
       
       P.pHand.add(0,D.getCard());
       P.pHand.add(1,D.getCard());
       players.add(P);
       
  }

  public void removePlayer(int indexOfPlayer){
    //Added by Logan Thresher
    for (int i = 0; i < players.elementAt((indexOfPlayer - 1)).pHand.size(); ++i) //Adds every card from the player to the removedCards vector
    {
      removedCards.add(players.elementAt((indexOfPlayer - 1)).pHand.elementAt(i));
    }
    
    players.remove(indexOfPlayer - 1);
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

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    // take the string we just received, and turn it into a user event
    Event SomethingHappens = gson.fromJson(msg, Event.class);

    if (SomethingHappens.event == EventType.NAME) {
        players.get(SomethingHappens.playerID).SetName(SomethingHappens.playerName);
    }

}
  public static String hints(Vector<Card> Hand){ /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
      //will be fi
      int total = 0;
      int indexReturn =0;
      String hintMessages [] = {"Hit", "Stand", "Double", "Split"};
      for(int i = 0; i < Hand.size();i++){
         total+= Card.getCardLiteralValue(Hand.get(i).getCardValue());
      }

      if(total >=17){
          indexReturn = 1;
      }
      return  hintMessages[indexReturn]; 
  }

  //clear the game/reset
  public static void clear(){
    
  }
public  boolean Update(EventType E){ /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
switch(E){
    case HIT:
      /*  Access Players Vector, Identify current player by currentTurn 
                  Then Accesses the Player's Hand
                   Adds a Card to the Hand 
                        Kierra Ashford                    */
                        if(players.get(currentTurn).playerID == 0){
                          
                        }
      players.get(currentTurn).pHand.add(D.getCard());
        
    break;

    case STAND:
      currentTurn = currentTurn++;
    break;

    case NAME:
    /*will have input bar as shown on front end*/
    break;


    case SPLIT:

         int toBeSplit = split(players.get(currentTurn).pHand);
    break;

    case BET:
              
    break;

    case FOLD:
           removePlayer(currentTurn);     
                 currentTurn = currentTurn++;

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
