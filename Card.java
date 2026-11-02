public class Card
{
	private String suit; //hearts, diamonds, etc
	private String value; //2-10, J, Q, K, A
	private int points; //1-14

	public Card (String csuit, String cvalue, int cpoints) 
	{
		//constructor
		suit = csuit;
		value = cvalue;
		points = cpoints;   
	}
	public String getSuit() 
	{
		return suit;
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       