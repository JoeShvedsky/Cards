import java.util.*;

public class Card {
	private Value value;
	private Suit suit;
	
	public Card(Value v, Suit s) {
		value = v;
		suit = s;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Value getValue() {
		return value;
	}

	
	
}
