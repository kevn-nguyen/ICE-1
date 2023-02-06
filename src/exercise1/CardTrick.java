package exercise1;

/*
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * AUTHOR - Kevin Nguyen 
 * DATE - February 6, 2023
*/

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
       
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            hand[0]= new Card();
            hand[0].setValue(1);
            hand[0].setValue("Hearts");        
            hand[1]= new Card();
            hand[1].setValue(2);
            hand[1].setValue("Clubs");        
            hand[2]= new Card();
            hand[2].setValue(3);
            hand[2].setValue("Diomonds");
            hand[3]= new Card();
            hand[3].setValue(4);
            hand[3].setValue("Spades");
            hand[4]= new Card();
            hand[4].setValue(5);
            hand[4].setValue("Clubs");
            hand[5]= new Card();
            hand[5].setValue(12);
            hand[5].setValue("Hearts");
            hand[6]= new Card();
            hand[6].setValue(11);
            hand[6].setValue("Hearts");
        }

        Scanner input = new Scanner(System.in);
        
        int userValue =input.nextInt();
        String userSuit= input.nextLine();
        
        for(int i =0;i<hand.length;i++){
            if(hand[i].getValue()==userValue &&
               hand[i].getSuit().equals(userSuit)){
                printInfo();
            }//end of if
        }//end of for

}    
    
/**
 * A simple method to print out personal information. Follow the instructions to 
 * replace this information with your own.
 * @author Paul Bonenfant Jan 2022
 */
    
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    }
}
