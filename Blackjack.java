//Lily Fraser
//Blackjack.java

import java.util.Scanner;
public class Blackjack
{
	public static void main(String[] args)
	{
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String[] rank = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] cards = new String[52];
		int[] indexesTakenForCards = new int[52];
		//loops to make all 52 cards
		int k = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 13; j++)
			{
				cards[k] = rank[j]+ " of " + suits[i];
				k++;
			}
		}
		// number of players
		System.out.println("Shuffling cards...");
		System.out.println("Welcome to Blackjack.");
		numPlayersInNewVersion = scan.nextInt();
		String buffer = scan.nextLine();
		
		//getting dealer's cards
		int dealerFirstCardIndex = (int)(Math.Random()*52);
		int dealerSecondCardIndex = (int)(Math.Random()*52);

		indexesTakenForCards[0] = dealerFirstCardIndex;
		indexestakenForCards[1] = dealerSecondCardIndex;

		while(indexesTakenForCards[0] == indexesTakenForCards[1])
		{
			dealerSecondCardIndex = (int)(Math.Random()*52);
			indexestakenForCards[1] = dealerSecondCardIndex;
		}
		
		int playerFirstCardIndex = (int)(Math.Random()*52);
		int playerSecondCardIndex = (int)(Math.Random()*52);










//array to store about cards
				 




	}

}