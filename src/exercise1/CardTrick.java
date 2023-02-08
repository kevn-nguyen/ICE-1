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
            hand[0].setSuit("Hearts");     
            hand[1]= new Card();
            hand[1].setValue(2);
            hand[1].setSuit("Clubs");        
            hand[2]= new Card();
            hand[2].setValue(3);
            hand[2].setSuit("Diomonds");
            hand[3]= new Card();
            hand[3].setValue(4);
            hand[3].setSuit("Spades");
            hand[4]= new Card();
            hand[4].setValue(5);
            hand[4].setSuit("Clubs");
            hand[5]= new Card();
            hand[5].setValue(12);
            hand[5].setSuit("Hearts");
            hand[6]= new Card();
            hand[6].setValue(11);
            hand[6].setSuit("Hearts");
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
 * @author Kevin Nguyen Jan 2022
 */
    
    private static void printInfo() {
        
        
        System.out.println("My name is Kevin Nguyen.");
	System.out.println("I was born in Canada but my parents are orignally from Vietnam.");
        
        System.out.println("My hobbies are: Snowboarding, Mountain-biking, Video games.");
	System.out.println("I believe Netflix's new password sharing policty is stupid.");
	System.out.println("I hope Netflix goes under!");
        
    }
}
