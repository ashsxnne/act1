
package activity1;
import java.util.Scanner;

public class activity2 {
   
    public static void main(String[] args) {
        Scanner ac =  new Scanner (System.in);
        
        System.out.print("Enter Employee name: ");
        String name  = ac.nextLine();
        System.out.print("Enter hourly rate: ");
        float hrate = ac.nextFloat();
        System.out.print("Enter total hours worked this week: ");
        float hrs = ac.nextFloat();
        
        System.out.println("------- Wage Summary -------");
        System.out.println("Employee: " +name);
        System.out.println("Hourly rate: " +hrate);
        System.out.println("Hours Worked: " +hrs);
        System.out.println("Gross Weekly Wage: " +(hrs*hrate));
        System.out.println("SSS Contributions(10%%): " + (hrs*hrate)* 0.1);
        System.out.println("--------------------------");
        System.out.println("Net Weekly Wage: "+((hrs*hrate)- ((hrs*hrate)* 0.10)));
           
    }
}
