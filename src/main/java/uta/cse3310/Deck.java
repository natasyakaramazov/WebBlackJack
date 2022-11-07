package uta.cse3310;
import java.util.Vector;
import java.util.Random;

//Logan Thresher
public class Deck
{
	static int DECKS = 1; //Number of decks
	Vector<Card> deck = new Vector<Card>();
	Random rand = new Random();
	
	//Initializes a deck with all cards
	Deck()
	{
		for (int i = 0; i < (DECKS); ++i)
        {
            for (int j = 0; j < 4; ++j)
            {
                for (int k = 0; k < 13; ++k) //13 cards in one suit
                {
                    Card newCard = new Card();
                    switch (j)
                    {
                    case 0:
                        newCard.cardsuit = CardSuit.CLUBS;
                        break;
                    case 1:
                        newCard.cardsuit = CardSuit.DIAMONDS;
                        break;
                    case 2:
                        newCard.cardsuit = CardSuit.SPADES;
                        break;
                    case 3:
                        newCard.cardsuit = CardSuit.HEARTS;
                        break;
                    }
                    
                    switch (k)
                    {
                    case 0:
                        newCard.cardvalue = CardValue.Ace;
                        break; 
                    case 1:
                        newCard.cardvalue = CardValue.Two;
                        break;
                    case 2:
                        newCard.cardvalue = CardValue.Three;
                        break; 
                    case 3:
                        newCard.cardvalue = CardValue.Four;
                        break;
                    case 4:
                        newCard.cardvalue = CardValue.Five;
                        break;
                    case 5:
                        newCard.cardvalue = CardValue.Six;
                        break;
                    case 6:
                        newCard.cardvalue = CardValue.Seven;
                        break;
                    case 7:
                        newCard.cardvalue = CardValue.Eight;
                        break;
                    case 8:
                        newCard.cardvalue = CardValue.Nine;
                        break; 
                    case 9:
                        newCard.cardvalue = CardValue.Ten;
                        break; 
                    case 10:
                        newCard.cardvalue = CardValue.Jack;
                        break; 
                    case 11:
                        newCard.cardvalue = CardValue.Queen;
                        break;
                    case 12:
                        newCard.cardvalue = CardValue.King;
                        break; 
                    }
                    deck.add(newCard);
                }
            }
        }
        shuffle();
	}
	
	//Shuffles the deck
	void shuffle()
	{
		Vector<Card> tempDeck = new Vector<Card>();
        for (int i = 0; i < (52 * DECKS); ++i)
        {
            int randomNumber = rand.nextInt(deck.size());
            tempDeck.add(deck.elementAt(randomNumber));
            deck.removeElementAt(randomNumber);
        }
        deck = tempDeck;
	}
	
	//Returns the card at the end of the deck, returns the card
	Card getCard()
	{
		Card temp = deck.elementAt(deck.size() - 1);
        deck.remove(deck.size() - 1);
        
        return temp;
	}
	
}
