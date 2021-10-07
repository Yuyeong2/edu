package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
    //배열 X
    protected List<Card> myCards = new LinkedList();

    public Gamer() {
        init();
    }

    private void init() {
        myCards = new LinkedList();
    }
    //카드 받기
    public void receiveCard(Card c) {
        myCards.add(c);
    }

    //카드 오픈
    public List<Card> openCards() {
        return myCards;
    }

    public void showAllMyCards() {
      for(Card c : myCards) {
            System.out.println(c);
        }
    }

}
