package blackjack;

import java.util.List;

public class Dealer extends Gamer {
    public void moreCard(CardDeck cd) {
        //본인의 카드가 2장인지 확인
        //2장의 카드의 점수가 16점 이하인지 확인
        //16점 이하면 한장 더 뽑기

        //List<Card> localMyCards = openCards();
        if(myCards.size() == 2) {
            int sumPoint = 0;
            for(int i=0; i<2; i++) {
                Card c = myCards.get(i);
                sumPoint += c.getPoint();
            }
            if(sumPoint <= 16) {
                Card c = cd.getCard();
                receiveCard(c);
                //receiveCard(cd.getCard());
            }


            // Card c1 = myCards.get(0);
            // Card c2 = myCards.get(1);

            // sumPoint += c1.getPoint();
            // sumPoint += c2.getPoint();

        }

        myCards.get(0);
    }
}
