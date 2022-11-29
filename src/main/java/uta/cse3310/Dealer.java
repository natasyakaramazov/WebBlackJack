/*
* Alexander Jones
*/
package uta.cse3310;
import java.util.Vector;
import java.util.Random;
import uta.cse3310.Game;

public class Dealer extends Player
{
    //int playerID = 0;                                   // Dealer playerID will always be 0
    //int amountWon = 0;                                 //  Amount of money won by the dealer
    int dealerhandamount;                             //   The total amount of cards the dealer value will hold
    int randnumber;                                  //    Integer value that will store random number
    int i = 0;                                      //     Incrimentor
    Event.EventType choice;                                  //      What choices the dealer will make
    Vector<Card> dealerhand;                        //       What will hold the dealers cards
    //Vector hand = new Vector();
         
  public Dealer() /*Created by Alexander Jones, Last Edited by Alexander Jones */
    { 
        Card tempCard = new Card();
        dealerhand = new Vector<Card>(); //       What will hold the dealers cards
        dealerhand.add(tempCard);
        
          //choice.HIT;

        if(dealerhand.size() == 0)
        {
            
            if (tempCard.getCardValue() == CardValue.Ace)
            {
                // allow players to call for insurance
            }
        }
       // choice.hit();     
       /*  Event dealer = new Event();
                          dealer.EventType = Hit;
                               Update(dealer);
                            */
        dealerhandsize();

        //while (dealerhandamount != 21)
        //{
        //    //logicCheck();
        //}


    }



    void getRandomNumber()  /* Created by Alexander Jones, Last Edited by Alexander Jones */
    {
        // Generates a random number between 1 and 7 when called on, guarentees random number everytime
        randnumber = (int) (Math.random() * (7 - 1)) + 1;
    }

    void dealerhandsize() /* Created by Alexander Jones, Last Edited by Alexander Jones */
    {
        // gets the total sum of all the cards
    

        for(i = 0; i < dealerhand.size(); i++)
        {
            //handamount += dealerhand[i].CardValue;
        }

    }


    void logicCheck() /*Created by Alexander Jones, Last Edited by Alexander Jones */
    {
        // if(hand == 0) empty deck then draw first card

        //if(dealerhand.get(0) == CardValue.Ace)  // if first card is an Ace, allow players the option to choose insurance
        {
            
        }
        if(dealerhandamount <= 17)                  // if value of the cards are less than 17, then have a rand event that will determine if they dealer will hit or double
        {
            if(randnumber < 5)                 // random number between 1-7, if you get a value less then 5, then stay, but if you get a value more than 5, chance it
            {
                //choice.STAND;
            }
            else
            {
                //choice.HIT;
            }

        }
    }

}
