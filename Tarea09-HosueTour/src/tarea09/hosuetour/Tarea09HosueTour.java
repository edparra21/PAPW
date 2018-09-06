/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea09.hosuetour;

import java.util.Scanner;

/**
 *
 * @author LegionY720
 */
public class Tarea09HosueTour {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static int userInput = 0;
    static boolean reset = true;
    public static void main(String[] args) {
        // TODO code application logic here
        while(reset)
        {
            System.out.println("Bienvenido! Entra.\n1.Entrar 2.Quedarse afuera");
        userInput = scanner.nextInt();
        scanner.nextLine();
        if(userInput == 1)
            Inside();
        else
            Outside();
        }
        
        
        System.out.println("Okay. Hasta pronto!");
    }
    
    public static void Inside()
    {
        System.out.println("Esta es la Sala. A donde quieres ir ahora?\n1.Subir al 2do piso 2.Comedor 3.Baño 4.Salir");
        userInput = scanner.nextInt();
        scanner.nextLine();
        switch(userInput)
        {
            case 1:
                SecondFloor();
                break;
            case 2:
                DinningRoom();
                break;
            case 3:
                Bathroom(userInput);
                break;
            case 4:
                Outside();
                break;
        }
    }
    public static void Outside()
    {
        System.out.println("¿Estas seguro que no quieres entrar?.\n1.Si 2.No");
        userInput = scanner.nextInt();
        scanner.nextLine();
        if(userInput == 1)
        {
            reset= !reset;
            return;
        }
        
            return;
    }
    
    public static void SecondFloor()
    {
        System.out.println("Estas en la segunda planta.\nA donde quieres ir ahora?\n1.Cuarto de Pato 2.Cuarto de Wendy 3.Baño 4.Bajar a Primer Piso");
        userInput = scanner.nextInt();
        switch(userInput)
        {
            case 1:
                case2:
                BedRooms(userInput);
                break;
            case 3:
                Bathroom(userInput);
                break;
             
                
        }
    }
    public static void BedRooms(int roomPar)
    {
        if(roomPar==1)
        {
            System.out.println("Estas en mi cuarto! Que quieres hacer?\n1.Abrir el balcon 2. acostarte 3.Salir del cuarto");
            userInput = scanner.nextInt();
            scanner.nextLine();
            switch(userInput)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    SecondFloor();
                    break;    
            }
        }
        else
        {
            System.out.println("Estas en el cuarto de Wendy. Am... okay, ya salte.\n 1.Salir del cuarto 2.Quedarse en el cuarto");
            userInput = scanner.nextInt();
            scanner.nextLine();
        }
            
    }
    public static void DinningRoom()
    {
        System.out.println("Estas es el Comedor! ");
    }
    
    public static void Bathroom(int floorPar)
    {
        switch(floorPar)
        {
            case 1:
                System.out.println("Estas en el baño del primer piso. Sal cuando estés listo.\n 1.Salir del Baño");
                userInput = scanner.nextInt();
                scanner.nextLine();
                if(userInput==1)
                    Inside();
            break;
            case 2:
                System.out.println("Estas en el baño del segundo piso.");
                userInput = scanner.nextInt();
                scanner.nextLine();
                if(userInput == 2)
                    SecondFloor();
            break;
        }
            
    }
    
}
