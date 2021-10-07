package blackjack;

public class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();

        for(int i=0; i<3; i++) {
            Card c = cd.getCard();
            System.out.println(c);

            gamer.receiveCard(c);
        }
        System.out.println("---------------------");
        //cd.showAllCards();

        gamer.showAllMyCards();
    }
}
