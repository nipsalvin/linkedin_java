/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_flow;

import java.util.Scanner;

/**
 *
 * @author Nips
 */
public class Control_Flow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner =new Scanner(System.in);
        
        int inputtedNum = scanner.nextInt();
        
        if (inputtedNum < 5) {
            System.out.println("Enjoy the goodluck a friend brings you today");        
        }
        else {
            System.out.println("Your shoe selection will make you very happy today");
        }
        
        
    }
    
}
