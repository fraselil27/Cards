public class DeckofStrings
{
	
public static void main(String[] args)
	{
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String[] rank = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] cards = new String[52];
		
		int k = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 13; j++)
			{
				cards[k] = rank[j]+ " of " + suits[i];
				k++;
			}
		}

		for(int l = 0; l < 52; l++)
		{
			System.out.print(cards[l] + ". ");
		}
	}
}

