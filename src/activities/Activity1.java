/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activities;

import java.util.Scanner;

public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner den = new Scanner(System.in);

        String name;
        
        System.out.println("Enter student name: ");
        name = den.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int numSubjects = den.nextInt();

        double totalgrades = 0;

        
        for (int k = 1; k <= numSubjects; k++) {
            System.out.print("Enter grade sub" + k + ": ");
            double grade = den.nextDouble();
            totalgrades += grade;  
        }

       
        double average = totalgrades / numSubjects;

       
        System.out.println("\nAverage: " + String.format("%.2f", average));

        String remarks;
        if (average >= 60) {
            remarks = "PASSED";
        } else {
            remarks = "FAILED";
        }

        System.out.println("Remarks: " + remarks);

        
    }
    
}
