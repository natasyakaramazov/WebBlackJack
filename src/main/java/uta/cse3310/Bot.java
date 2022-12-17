/*Greg Jolly */
package uta.cse3310;

import java.util.Vector;
import uta.cse3310.Card;

	public class Bot extends Player{

public enum CheckStatus{

NORMAL{
public  String decision(Vector<Card> Hand){
int total = 0;
 for(int i = 0; i < Hand.size();i++){
         total+= Card.getCardLiteralValue(Hand.get(i).getCardValue());
      }
   if(total >=17){
return "Stand";
} if(total <17){

 return "HIT";
}
if(total ==10){
return "SPLIT";
}
return "DEBUG";
}
} 
,
MINIMALRISK{

public String decision(Vector<Card> Hand){

int total = 0;
 for(int i = 0; i < Hand.size();i++){
         total+= Card.getCardLiteralValue(Hand.get(i).getCardValue());
      }

if(total >12){
return "STAND";
}
if(total <12){
return "HIT";
}
return "DEBUG";
}
},

HIGHRISK{

public  String decision(Vector <Card> Hand){

int total = 0;
 for(int i = 0; i < Hand.size();i++){
         total+= Card.getCardLiteralValue(Hand.get(i).getCardValue());
      }
if(total>=19){
return "STAND";
}

if(total<19){

return "HIT";
}
return "DEBUG";
}
}

}
CheckStatus newStatus;

public Bot(){
//set default to normal
 playerID = 1;
 newStatus = CheckStatus.NORMAL;

}


}



    //int amountwon = 5000; //intial amount that bot has
   
    //the hand of the bot
    //Vector <Card> bHand = new Vector <Card>(); //Created by Greg Jolly; Last Edited by Greg Jolly

    //logic check of the bot 
   

    //status of that dictates whether the bot should bet or not 


