package cardtrick;

import java.util.Scanner;

/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 * 
 * Student ID: 991657009
 * @author Josh Jocson
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
      Card[] magicHand = new Card[7]; //Array of object 
      System.out.println("The Hand was: ");      
      for (int i=0;i<magicHand.length;i++)
      {
        // step 1: generate 7 random cards and store in array
          Card c= new Card();
          c.setNumbers((int)((Math.random() * 12) + 1));//random generation for number/use method
          c.setSuit(c.SUITS[(int)((Math.random() * 3))]);
          System.out.println(c.getNumbers() + " of " + c.getSuit());
          magicHand[i] = c; // stores the card object  in array   
    }
      //step 2: take input guess the card 2 spades find in array - print your card is found
        System.out.println("");
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        boolean match = false;
        System.out.print("Please enter a number between 1 to 13: "); 
        int userInputNum = keyboard.nextInt();
        System.out.print("Please enter a suit: ");
        String userInputSuit = keyboard.next();
        
        do{
            if(userInputNum == magicHand[count].getNumbers() && userInputSuit.equals(magicHand[count].getSuit())){
                System.out.println("Your card was generated");
                match = true;
            } else {
                count++;
            }
        }while (match == false && count < 7);
        if(count == 7){
            System.out.println("Your card was not part of the hand");
        }
    }
}

