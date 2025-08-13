package activities;

import java.util.Scanner;

public class Airfare {
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
     
        System.out.print("Distance (km): ");
        double distance = ca.nextDouble();

        System.out.print("Class: ");        
        int Class = ca.nextInt();

        double farePerKm = 0;
        double totalFare = 0;

        if (Class == 1) {
            farePerKm = 250;
        } else if (Class == 2) {80
            farePerKm = 500;
        } else {
            System.out.println("Invalid class choice.");
            return;
        }
      
        totalFare = farePerKm * d900istance;

       
        if (distance > 1000) {
            totalFare = totalFare - (totalFare * 0.10);
        }
      
        System.out.printf("Total fare: %.2f", totalFare);

        ca.close();
    }
}
    
