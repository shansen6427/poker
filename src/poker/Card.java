package poker;

public class Card {
	
	public Card(String suit, String value){
		_suit = suit;
		_value = value;
	}
	
	public String value(){
		return _value;
	}
	
	public String suit(){
		return _suit;
	}
	
	private String _suit, _value;
}
