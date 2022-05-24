import java.util.Scanner;

public class JavaCompsciPrgoram9JohnDawson {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int [] deck = new int[36]; //declares size of deck to accommodate 4 suits
		int card = (int)(Math.random() * 35);
		
		System.out.println("Welcome to Card Deck!");
		System.out.println("Please enter how many times the deck should shuffle: ");
		int n = stdIn.nextInt();
		System.out.println();
		
		int cValue = cardValue(card);
		String cardSuit = cardSuit(card);
		
		displayCard(cValue, cardSuit);
		initDeck(deck);
		shuffleDeck(deck, n);
		displayDeck(deck);
		
		stdIn.close();
	}
	
	//Finds the value of the card
	public static int cardValue(int card) {
		int cardvalue = (card % 9 + 1);
		return cardvalue;		
	}

	//Finds the suit using the value of the card
	public static String cardSuit(int card) {
		
		String result;
		
		if (card <= 8 && card >= 0) {
			result = "Clubs";
		}
		else if (card <= 17 && card >= 9) {
			result = "Spades";
		}
		else if (card <= 26 && card >= 18) {
			result = "Hearts";
		}
		else {
			result = "Diamonds";
		}
		return result;
		
	}
	
	//Displays the card and its suit
	public static void displayCard (int cardValue, String cardSuit) {
		
		System.out.println("The card you picked was a " + cardValue + " of " + cardSuit + ".");
		
	}
	
	//Sorts the index of the deck
	public static void initDeck(int[] deck) {
		for (int i = 0; i < 36; i++) {
			deck[i] = i;
		}
	}
	
	//Shuffles the deck
	public static void shuffleDeck(int[] deck, int n) {
		
		int j;
		int k;
		int ph1;
		int ph2;
		
		for (int i = 0; i <= n; i++) {
			j = (int)((Math.random()) * 35);
			k = (int)((Math.random()) * 35);
			
			ph1 = deck[j];
			ph2 = deck[k];
			deck[j] = ph2;
			deck[k] = ph1;
		}	
		
	}
	
	//Displays the deck
	public static void displayDeck(int[] deck) {
		
		System.out.println();
		System.out.println("Below is the newly shuffled deck, in order of cards: ");
		for (int i = 0; i <= 35; i++) {
			int card = deck[i];
			int cardvalue = (card % 9 + 1);
			String result;
			
			if (card <= 8 && card >= 0) {
				result = "Clubs";
			}
			else if (card <= 17 && card >= 9) {
				result = "Spades";
			}
			else if (card <= 26 && card >= 18) {
				result = "Hearts";
			}
			else {
				result = "Diamonds";
			}
		
			System.out.println(cardvalue + " of " + result);
		}
		
	}
	
		
}
