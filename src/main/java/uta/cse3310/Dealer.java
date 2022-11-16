/*
* Alexander Jones
*/
package uta.cse3310;
import java.util.Vector;

public class Dealer
{
    int amountWon = 0; // Amount of money won by the dealer
    int handamount;
    int i = 0;
    Vector<Card> hand = new Vector<Card>(); // What will hold the dealers cards


    Dealer() /*Created by Alexander Jones, Last Edited by Alexander Jones */
    {
        handsize();

        while (handamount != 21)
        {
            logicCheck();
        }


    }
    
    /*
     * void logicCheck() // this will be used to help the determine the best next move
        {
    
        }
     */


    //while(Card.Cardvalue != 21 || Card.Cardvalue <= 21)



    void handsize() /*Created by Alexander Jones, Last Edited by Alexander Jones */
    {
        
        int i = 0;

        for(i = 0; i < hand.size(); i++)
        {
            //handamount += hand[i].CardValue;
        }

    }

    void logicCheck() /*Created by Alexander Jones, Last Edited by Alexander Jones */
    {

    }

}