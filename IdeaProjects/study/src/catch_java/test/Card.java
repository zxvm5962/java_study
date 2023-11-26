package catch_java.test;

public class Card {

    static int number;

    public Card(){
        number ++;

    }


    public String toString(){
        return "card 번호는 " + number + "입니다.";
    }

    public static void main(String[] args) {
        Card[] cards = new Card[100];
        for (Card card : cards) {
            card = new Card();
            System.out.println(card);
        }
    }
}
