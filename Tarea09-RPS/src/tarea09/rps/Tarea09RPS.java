/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea09.rps;

import java.util.Scanner;

/**
 *
 * @author LegionY720
 */
public class Tarea09RPS {
    
    /**
     * @param args the command line arguments
     */
    static boolean keepPlaying = true;
    static int reset = 0;
    static  int userChoice = 0, npcChoice = 0;
    static Scanner scanner;

    public static void main(String[] args) {
        // TODO code application logic here
        do
        {
            System.out.println("Choose:\n1.Rock\n2.Paper\n3.Scissors");
            scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            scanner.nextLine();
            
            npcChoice = (int)Math.floor(Math.random()*3);
            
            System.out.println();
            
            switch(userChoice)
            {
                case 1:
                    System.out.println("You chose Rock");
                    break;
                case 2:
                    System.out.println("You chose Paper");
                    break;
                case 3:
                    System.out.println("You chose Scissors");
                    break;
            }
            switch(npcChoice)
            {
                case 1:
                    System.out.println("NPC chose Rock");
                    break;
                case 2:
                    System.out.println("NPC chose Paper");
                    break;
                case 3:
                    System.out.println("NPC chose Scissors");
                    break;
            }
            if(userChoice==npcChoice)
            {
                /*
                    1 - 2 = npc
                    1 - 3 = user
                    2 - 1 = user
                    2 - 3 = npc
                    3 - 1 = npc
                    3 - 2 = user
                */
                System.out.println("Game Tied. Wanna try again? 1.YES 2. NO");
                reset = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
            }else if((userChoice == 1 && npcChoice == 2) || (userChoice == 2 && npcChoice == 3) || (userChoice == 3 && npcChoice == 1))
            {
                System.out.println("NPC Won. Wanna try again? 1.YES 2. NO");
                 reset = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
            }else if((userChoice == 1 && npcChoice == 3) || (userChoice == 2 && npcChoice == 1) || (userChoice == 3 && npcChoice == 2) )
            {
                System.out.println("You Won! Wanna try again? 1.YES 2. NO");
                 reset = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
            }
                
            if(reset == 2)
                keepPlaying = !keepPlaying;
        }while(keepPlaying);
        
        System.out.println("Thanks for playing!");
    }
    
    
    
}
