package uta.cse3310;
import java.util.Vector;
import uta.cse3310.Event.EventType;
public class Game {

    Vector<Player> players; //KA
     int currentTurn; //KA

  /*public static void main(String[] args) {

    S
    
  }*/

  public  void addPlayer(Player P){ /*Created by Kierra Ashford, Last edited by Kierra Ashford */
       players.add(P);
       
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
public void Update(EventType E){

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
