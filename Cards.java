import java.util.*;

/*  -Create a class ‘Cards’ and define suitable class variables for it.
    -Create a class ‘ClassicGame’ and define suitable class variables for it.
    -The function of the class ‘ClassicGame’ name game will take two cards as input and compare them.
    -First, compare the values on the cards; the player having higher number on the card will win the game.
     For example, the card having the number 2 will lose to the card having the number 3.
    -If the numbers on the cards are the same, compare the suits of the two cards. The suits in order of priority are:
    Spades > Diamond > Hearts > Clubs
    -Increase the point of the winner card by 1 and print the scores. */

public class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.
    public int getValue(){
        return this.value;
    }
    public String getSuit(){
        return this.suit;
    }

    int getSuitPriority(String suitString) {
    //Write your code here.
        switch(suitString){
            case "spades":
                return 4;
            case "diamonds":
                return 3;
            case "hearts":
                return 2;
            case "clubs":
                return 1;
            default:
                return 0;
            }
    }
}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    Cards cards = new Cards();

    int compareSuits(String sp1, String sp2){
        if(cards.getSuitPriority(sp1) > cards.getSuitPriority(sp2)) {
            return 1;
        }
        else if(cards.getSuitPriority(sp1) < cards.getSuitPriority(sp2)) {
            return 2;
        }
        else {
            return 0;
        }
    }
    public void game(Cards c1, Cards c2) {

        //Write your code here[
        if(c1.getValue() > c2.getValue()) {
            points1 += 1;
        }
        else if(c1.getValue() < c2.getValue()) {
            points2 += 1;
        }
        else {
          int finalSuit =  compareSuits(c1.getSuit(), c2.getSuit());
          if(finalSuit == 1){
              points1 +=1;
          }
          else if(finalSuit == 2){
              points2 +=1;
          }
        }
        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }
}


class Source {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}

