import java.util.ArrayList;



public class Hand {
     // Attributes

     private ArrayList<Card> cards; // Cards in hand

     // Default constructor

     public Hand() {
          cards = new ArrayList<Card>(); // A singly linked list of cards
     }

     // Methods

     public void addCard(Card card) {
          cards.add(card);
     }

     public Card playCard(int i ) {
          Card cardToPlay = (Card) cards.remove(i);

          return cardToPlay;
     }

     public int getSize() {
          return cards.size();
     }

     public void display() {
          String[][] tempArray = new String[13][4];
          int k = 1;

          // Populate tempArray with cards
          for (int i = 0; i < 6; ++i) {
               for (int j = 0; j < 4; j++) {
                    if (cards.get(k) != null) {
                         tempArray[i][j] = cards.get(k).toString();
                         k++;
                    }
               }
          }

          for (int i = 0; i < 6; ++i) {
               if (tempArray[i][0] != null) {
                    for (int j = 0; j < 4; j++) {
                         if (tempArray[i][j] != null) {
                              System.out.print(String.format("%3s", tempArray[i][j]));
                              System.out.print(" ");
                         }
                    }
                    System.out.println();               
               }
          }

          // cards.printList(cards.getNode(0));
     }
}