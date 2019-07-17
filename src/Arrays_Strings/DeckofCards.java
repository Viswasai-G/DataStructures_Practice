package Arrays_Strings;

import java.util.Arrays;
import java.util.Random;

public class DeckofCards {
    int[] deck = new int[52];
   public void shuffle(){
       Random random = new Random();
       for(int i = 0; i<deck.length; i++){
           deck[i] = i+1;
       }
       System.out.println("Initialized 52 cards: "+Arrays.toString(deck));
       for(int i=0;i<deck.length;i++){
           int value = random.nextInt(52)+1;
           int temp = deck[i];
           if(deck[i] != value){
               deck[i] = deck[value-1];
               deck[value-1] = temp;
           }
       }
       System.out.println("Shuffled card deck: "+Arrays.toString(deck));
   }
}
