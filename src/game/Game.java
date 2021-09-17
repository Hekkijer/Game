/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5 - 0 + 1) + 0;
        Scanner in = new Scanner(System.in);
        
        int count = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("You have "+count+" lifes");
            System.out.println("Choose number from 0 to 5: ");
            int number = in.nextInt();

            if (num == number) {
                System.out.print("Yes, yo won");
                break;
            } else {
                System.out.println("No, you lost");
                count -= 1;
            }
        }
        
        if (count == 0) {
            System.out.println("Thats all, you dont have any lifes");
            System.out.println("The number was "+num);
        }
        
    }
    
}
