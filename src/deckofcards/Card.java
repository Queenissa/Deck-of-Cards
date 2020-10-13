/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

/**
 *
 * @author 1styrGroupB
 */
public class Card {

    private char suit;
    private String rank;
    
    public Card(String rank, char suit){
        this.rank=rank;
        this.suit=suit;
    }
    

    
    public char getSuit(){
        return suit;
    }
    
    public char setSuit(char suit){
        return this.suit = suit;
    }
    
    public String getRank(){
        return rank;
    }
    
    public String setRank(String rank){
        return this.rank = rank;
    }
    
    

}
