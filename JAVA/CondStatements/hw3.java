package CondStatements;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner x = new Scanner(System.in);
        int day = x.nextInt();
        switch (day) {
            case 1: 
            System.out.println("Monday");
            break;
            case 2: 
            System.out.println("Tuesday");
            break;
            case 3: 
            System.out.println("Wadnesday");
            break;
            case 4: 
            System.out.println("Thursday");   
            case 5: 
            System.out.println("Friday");  
            break;
            case 6: 
            System.out.println("Saturday");
            break;   
            case 7: 
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Error");
                break;
        }
    }
}
