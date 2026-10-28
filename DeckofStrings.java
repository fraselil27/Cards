public class DeckofStrings
{
		//declares all of the arrays as strings
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String[] rank = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] cards = new String[52];
		//loops to make all 52 cards
		public void MakeDeck()
		{
			int k = 0;
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 13; j++)
				{
					cards[k] = rank[j]+ " of " + suits[i];
					k++;
				}
			}
			//prints all of the cards
			for(int l = 0; l < 52; l++)
			{
				System.out.print(cards[l] + ". ");
			}
		}
}

