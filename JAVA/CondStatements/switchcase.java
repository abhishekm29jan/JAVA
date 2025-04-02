package CondStatements;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
      int age;
      System.out.println("Enter your age");
      Scanner x = new Scanner(System.in);
      age = x.nextInt();
      switch (age) {
        case 18:
            System.out.println("You are adult");
            break;
        case 24: 
        System.out.println("You have a job");
        
        case 28: 
        System.out.println("You are married");

        case 32: 
        System.out.println("You have a kid");
        default:
        System.out.println("Bhak bsdk!!");
            break;
      }

    }
}
