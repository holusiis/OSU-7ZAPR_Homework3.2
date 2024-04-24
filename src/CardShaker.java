import java.util.Arrays;
import java.util.Random;

public class CardShaker {
    private Card[] cards = new Card[32];

    /**
     * Generates all 32 possible Card combinations and fills the objects only attribute (array) with them
     * in order: hearts -> diamonds -> pikes -> clovers, automatically assigns corresponding color and generates all possible ranks for them
     */
    public void generateAllCards() {
        String[] color = {"Red", "Black"};
        String[] shape = {"Hearts", "Diamonds", "Pikes", "Clovers"};
        String[] rank = {"7", "8", "9", "10", "J", "Q", "K", "A"};
        for(int i = 0; i < cards.length; i++) {
            cards[i] = new Card(color[(i/16)], rank[i % 8], shape[(i/8)]);
        }
    }

    /**
     * Shakes all cards by passing through the field and automatically switching the current position with a random one
     */
    public void shakeAllCards() {
        Random random = new Random();
        for(int i = 0; i < cards.length; i++) {
            int rndPosition = random.nextInt(0, cards.length);
            Card temp = cards[rndPosition];
            cards[rndPosition] = cards[i];
            cards[i] = temp;
        }
    }

    /**
     * Prints all cards in the CardShaker object
     */
    public void printAllCards() {
        System.out.println(Arrays.toString(cards));
    }

    /**
     * Finds all cards with a specific rank in the CardShaker object
     * @param color color of searched cards
     * @return array of object Card with all found cards (16 objects)
     */
    public Card[] getCardsWithColor(String color) {
        Card[] array = new Card[16];
        for(int i = 0, position = 0; i < cards.length; i++) {
            if(cards[i].getColor().equals(color)) {
                array[position] = cards[i];
                position++;
            }
        }
        return array;
    }

    /**
     * Finds all cards with a specific rank in the CardShaker object
     * @param rank rank of searched cards
     * @return array of object Card with all found cards (4 objects)
     */
    public Card[] getCardsWithRank(String rank) {
        Card[] array = new Card[4];
        for(int i = 0, position = 0; i < cards.length; i++) {
            if(cards[i].getRank().equals(rank)) {
                array[position] = cards[i];
                position++;
            }
        }
        return array;
    }

    /**
     * Finds all cards with a specific shape in the CardShaker object
     * @param shape shape of searched cards
     * @return array of object Card with all found cards (8 objects)
     */
    public Card[] getCardsWithShape(String shape) {
        Card[] array = new Card[8];
        for(int i = 0, position = 0; i < cards.length; i++) {
            if(cards[i].getShape().equals(shape)) {
                array[position] = cards[i];
                position++;
            }
        }
        return array;
    }

    /**
     * Shakes all cards and picks the specified amount of cards from the beginning of the randomized array
     * @param count desired amount of object Card
     * @return array of object Card with desired amount of cards
     */
    public Card[] getRandomCards(int count) {
        shakeAllCards();
        Card[] array = new Card[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = cards[i];
        }
        return array;
    }

    /**
     * Prints an array of object Card
     * @param cardsToPrint array of object Card to be printed
     */
    public void printCards(Card[] cardsToPrint) { //Probably should be in class Card, but homeworks specified otherwise
        System.out.println(Arrays.toString(cardsToPrint));
    }
}

