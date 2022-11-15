/*
* Alexander Jones
* Logan Thresher
* Kierra Ashford
*/

package uta.cse3310;
import java.util.*;
enum CardValue
{
Ace, 
Two, 
Three, 
Four, 
Five, 
Six, 
Seven, 
Eight, 
Nine, 
Ten, 
Jack, 
Queen, 
King
}

enum CardSuit
{
HEARTS,
CLUBS,
DIAMONDS,
SPADES
}

public class Card
{
    CardValue cardvalue;
    CardSuit cardsuit;


Card()
{ /*Created by Alexander Jones, Last Edited by Alexander Jones */
    cardvalue = CardValue.Ace;
    cardsuit = CardSuit.HEARTS;
}

Card(CardValue v, CardSuit s) /*Created by Alexander Jones, last Edited by Alexander Jones */
{
    cardvalue = v;
    cardsuit = s;
}

public CardValue getCardValue(){  /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
    return  cardvalue;
}

public  static int getCardLiteralValue(CardValue v){ /*Created by Kierra Ashford, Last Edited by Kierra Ashford */
    int returnValue;
/*Creating an Enum map for the values of the cards */
EnumMap<CardValue, Integer> values = new EnumMap<>(CardValue.class);

    values.put(CardValue.Ace, 1);
    values.put(CardValue.Eight,8);
    values.put(CardValue.Five,5);
    values.put(CardValue.Four,4);
    values.put(CardValue.Jack,10);
    values.put(CardValue.King,10);
    values.put(CardValue.Nine,9);
    values.put(CardValue.Queen,10);
    values.put(CardValue.Seven,7);
    values.put(CardValue.Six,6);
    values.put(CardValue.Ten,10);
    values.put(CardValue.Three,3);
    values.put(CardValue.Two,2);
 
        returnValue = values.get(v);


       
    return returnValue;

}

}
