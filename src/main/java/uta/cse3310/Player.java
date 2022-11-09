/*Greg Jollly */

package uta.cse3310; 
import java.util.Scanner; 



public class Player{
    int amount = 200;
    int amountWon = 0;
    String name;  

    public Player(int id)
    {

    }   

    public void playerName(String n)
    {
        name = n;
        System.out.println("Welcome " + name + "!");
        
    }


}
