/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_loop;

import java.util.Scanner;

/**
 *
 * @author Nips
 */
public class While_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so answer yes");
            String userInput = input.next();
            
            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
    
}
