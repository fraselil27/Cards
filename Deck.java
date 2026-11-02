public class Deck
{
	//collection of cards
	
	//only declare at this point
	Card[] deckOfCards;
	
	public Deck(String dsuit[], String[] dvalues, int[] dpoints)
	{
		//constructor -- need to initialize deckOfCards
		int lengthSuits = dsuit.length;
		int lengthValues = dvalues.length;
		String[] deckOfCards = new String [lengthSuits*lengthValues];

		for(int i = 0; i < lengthValues)
		{
			for(int j = 0; j < lengthSuits; j++)
			{
				deckOfCards[i] = dvalues[i] + "of" + dsuit[j];
				i++;
			}
		}
	}
	//methods of Deck class like Shuffle, Deal
	public void shuffle()
	{
		//shuffle cards
	}

}