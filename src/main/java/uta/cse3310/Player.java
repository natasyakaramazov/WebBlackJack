/*Greg Jollly */

package uta.cse3310; 
import java.util.Scanner; 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class Player{
    int amount = 200;
    int amountWon = 0;
    String name;  
     String LastMessageToPlayer;
    public Player(int id)
    {

    }   

    public void playerName(String n)
    {
        name = n;
        System.out.println("Welcome " + name + "!");
        
    }


    public void SetName(String N) {
        name = N;
        LastMessageToPlayer="Welcome " + N + " to the game.";
    }

    public String asJSONString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


}
