package  uta.cse3310;
import java.util.Vector;
 public class Event{

  public enum EventType{
  NAME, STAND, SPLIT, HIT, FOLD, BET,HINT,DOUBLE;
  }
 EventType event;
  int playerID;
  String playerName;

public Event(){
     event = EventType.HIT; 
}

public Event(EventType s){
    event= s;
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
  public void hit(){

  }
 public void stand(){
  
 }
 

  public void bet() /*Created by Alexander Jones, Last Edited by Alexander Jones */
  {
    //player puts money into pot
  }


  
}
