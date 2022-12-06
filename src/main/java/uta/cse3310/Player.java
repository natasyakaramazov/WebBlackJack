/*Greg Jollly */

package uta.cse3310; 
import java.util.Scanner; 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Vector;



public class Player{
    int amount = 5000;
    int amountWon = 0;
    String name;  
    String LastMessageToPlayer;
    int playerID;

    // the hand of the player
    
    Vector <Card> pHand; //Created by Greg Jolly, Last Edited by Greg Jolly
      
        //player id 
    public Player(int id) //Created by Kierra Ashford; Last edited by Kierra Ashford 
    {

    }   

    public Player()
    {
        pHand = new Vector<Card>();
         
    }

    //logic check of the player

    /*public void logicCheck() //Created by Greg Jolly; Last Edited by Greg Jolly
    {
        while(true)
        {
            
        }
    }*/

    //sets the player name
    public void SetName(String N) { //Created by KIerra Ashford; Last Edited by Kierra Ashford
        name = N;
        LastMessageToPlayer="Welcome " + N + " to the game.";
    }

    public String asJSONString() { //Created by Kierra Ashford; Last Edited by Kierra Ashford
        Gson gson = new Gson();
        return gson.toJson(this);
    }


}
