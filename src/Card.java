public class Card {
    private String color;
    private String rank;
    private String shape;

    /**
     * A Card object with three attributes
     * @param color color of the card ("Red" or "Black")
     * @param rank rank of the card ("7", "8", "9", "10", "J", "Q", "K" or "A")
     * @param shape shape of the card ("Hearts", "Diamonds", "Pikes" or "Clovers")
     */
    public Card(String color, String rank, String shape) {
        this.color = color;
        this.rank = rank;
        this.shape = shape;
    }

    /**
     * Getter for attribute color
     * @return color of the card
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter for attribute rank
     * @return rank of the card
     */
    public String getRank() {
        return rank;
    }

    /**
     * Getter for attribute shape
     * @return shape of the card
     */
    public String getShape() {
        return shape;
    }

    /**
     * Overrides the default toString method
     * @return A string for the object Card with its attributes
     */
    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", rank='" + rank + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
