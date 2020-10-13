/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App app = new App();
        
        while(true)
        {
            app.menu();
            System.out.print("What do you want to do: ");
            switch(app.choice(input.nextInt()))
            {
                case 1:
                      app.create();
                      break;
                      
                case 2:
                      app.shuffle();
                      break;
                
                case 3: 
                      System.out.println("How many cards do you want to deal?: ");
                      app.deal(input.nextInt());
                      break;
                      
                case 4:
                    app.display();
                    break;
                    
                default:
                    System.out.println("Your choice is invalid. Try Again");
                    
                
            }
            
        }
    
    

    
    
    
           
 }    
    
    

}