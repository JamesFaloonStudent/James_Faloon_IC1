/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author James faloon
 * @number 991728135
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.ceil(13 * Math.random()));
            c.setSuit(Card.SUITS[(int)Math.round(3 * Math.random())]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());

        }
        
        
        System.out.print("Enter Card Value (1:13) : ");
        int value = input.nextInt();
        
        System.out.print("Enter Card Suit wher (0=hearts, 1=Diamonds, 2=Clubs, 3=Spades) : ");
        int suit = input.nextInt();
        String output = findCard(magicHand, value, suit);
        System.out.println(output);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
    
    
    private static String findCard(Card[] array, int value, int suit) {
        for (Card card : array) {
            if (card.getValue() == value && card.getSuit().equals(Card.SUITS[suit].toLowerCase())) {
            return "Your card is in the magic hand";
            }
        }
        
        return "card not found";
    }
    
}
