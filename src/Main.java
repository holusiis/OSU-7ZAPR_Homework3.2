public class Main {
    public static void main(String[] args) {
        CardShaker cardShaker = new CardShaker();
        cardShaker.generateAllCards();
        cardShaker.printAllCards();
        cardShaker.shakeAllCards();
        cardShaker.printAllCards();
        cardShaker.printCards(cardShaker.getCardsWithColor("Red"));
        cardShaker.printCards(cardShaker.getCardsWithRank("A"));
        cardShaker.printCards(cardShaker.getCardsWithShape("Diamonds"));
        cardShaker.printCards(cardShaker.getRandomCards(4));
    }
}