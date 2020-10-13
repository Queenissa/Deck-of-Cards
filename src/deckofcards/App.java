/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 1styrGroupB
 */
public class App {
    int choice(int input){
        return input;
    }
    
    
    public static void menu(){
        System.out.println();
        System.out.println("       ----MENU---      ");
        System.out.println("1 - Add Card");
        System.out.println("2 - Edit Card");
        System.out.println("3 - Remove Card");
        System.out.println("4 - View Card/s");
        System.out.println();
    }
    
    static ArrayList<Card> cards = new ArrayList<Card> ();
    
    
    public void create(){
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        char[] suits = {'C', 'H', 'D', 'S'};
        
        for(char suit: suits){
            for(String rank: ranks){
                cards.add(new Card(rank,suit));
            }
        }
        System.out.println("You've created cards");
       
    }
    
    
    
    public void shuffle(){
        if(cards.isEmpty()){
            System.out.println("You have no cards");
            System.out.println();
    }
        Collections.shuffle(cards);
        System.out.println("Cards are shuffled");
        System.out.println();
}
    
    
    public void deal(int input){
        if(input > cards.size()){
            System.out.println("Lower your number of card.");
            return;
        }
        while(input > 0){
            System.out.println(cards.get(0).getRank() + cards.get(0).getSuit());
            cards.remove(0);
            input--;        
        }
        System.out.println("You've dealt cards");
        
    }
    
    
   
    
    public void display(){
        if(cards.isEmpty()){
            System.out.println("You have no cards to display. Create your cards first.");
            System.out.println();
        }
        for(Card card: cards){
            System.out.println(card.getRank() + card.getSuit());
        }
}
    
    
    
    
}