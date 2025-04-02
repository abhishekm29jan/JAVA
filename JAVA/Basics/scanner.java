package Basics;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int sum = a+b+c;
        System.out.println("The numbers are " +a);
        System.out.println(" " +b);
        System.out.println(" " +c);
        System.out.println("The sum is \n " +sum);
        
    }
}
