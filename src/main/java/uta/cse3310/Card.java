/*
* Alexander Jones
* Logan Thresher
*/

package uta.webblackjack;

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
    cardsuit = CardSuit.Hearts;
}

Card(CardValue v, CardSuit s)
{
    cardvalue = c;
    cardsuit = s;
}
}
