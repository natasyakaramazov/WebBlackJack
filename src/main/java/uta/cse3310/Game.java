package uta.cse3310;
import java.util.Vector;
import uta.cse3310.Event.EventType;
class Game {

    Vector<Player> players;
     int currentTurn;
     
  /*public static void main(String[] args) {

    String message = hints();
    
  }*/

  public static void startGame(){
       
  }
  public static String hints(Vector<Card> Hand){
      //will be fi
      return "Hit"; 
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
