package  uta.cse3310;
import java.util.Vector;
 public class Event{

  public enum EventType{
  NAME, STAND, SPLIT, HIT, FOLD, BET;
  }
 EventType event;
  int playerID;
  String playerName;

public Event(){

}
 public void stand(){
   //moves it to another player's turn
   //CurrentTurn = Player.PlayerID++;
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
  

  
  public static int random(){
    //utilizing the random library

    return 0; 
  }
  public void insurance(){
    
  }
  public void doubleBet(){
    //doubles the bet of the player that calls it
  }
  
  public void hit() /*Created by Alexander Jones, Last Edited by Alexander Jones */
  { 
    //gives player another card
    
  }
  
  public void fold() /*Created by Alexander Jones, Last Edited by Alexander Jones */
  {
    //player surrenders hand
  }

  public void bet() /*Created by Alexander Jones, Last Edited by Alexander Jones */
  {
    //player puts money into pot
  }


  
}
