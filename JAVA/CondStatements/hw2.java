package CondStatements;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("Enter your marks in physics");
        Scanner s = new Scanner(System.in);
        int mark1 =s.nextInt();

        System.out.println("Enter your marks in chemistry");
        Scanner sc1= new Scanner(System.in);
        int mark2 =sc1.nextInt();

        System.out.println("Enter your marks in Java");
        Scanner sc2 = new Scanner(System.in);
        int mark3 =sc2.nextInt();

        int percentage = mark1 + mark2 + mark3 % 300;
        System.out.println("Total marks = " +percentage);
        if (percentage>40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
