/*
* Alexander Jones
* Logan Thresher
*/

package uta.cse3310;

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
{
    cardvalue = CardValue.Ace;
    cardsuit = CardSuit.HEARTS;
}

Card(CardValue v, CardSuit s)
{
    cardvalue = v;
    cardsuit = s;
}
}
