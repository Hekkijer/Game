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
        System.out.println("Choose number from 0 to 5: ");
        int number = in.nextInt();
        
        if (num == number) {
            System.out.print("Yes, yo won");
        }
        else {
            System.out.println("No, you lost, the number was "+num);
        }
    }
    
}
