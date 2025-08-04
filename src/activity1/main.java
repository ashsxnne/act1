/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

import java.util.Scanner;
import banking.BankApp;

public class main {

    public static void main(String[] args) {
        System.out.println("Activity 1");
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                BankApp ba = new BankApp();

                int attempts = 0;
                boolean verify = false;

                while (attempts < 3 && !verify) {
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();
                  
                    if (ba.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        verify = true; 
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! Attempts remaining: " + (3 - attempts));
                    }

                    
                    if (attempts == 3) {
                        System.out.println("Too many failed attempts. Exiting the system.");
                        System.exit(0); 
                    }
                }
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Invalid Selection!");

        }

    }

}
