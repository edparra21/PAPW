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
                Bathroom(1);
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
        System.out.println("Estas en la segunda planta.");
    }
    
    public static void DinningRoom()
    {
        System.out.println("Estas es el Comedor! ");
    }
    
    public static void Bathroom(int floorPar)
    {
        if(floorPar == 1)
        {
            System.out.println("Estas en el baño del primer piso.");
        }
        else if(floorPar == 2)
        {
            System.out.println("Estas en el baño del segundo piso.");
        }
            
    }
    
}
