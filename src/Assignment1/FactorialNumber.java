package Assignment1;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        printFactorialNumber(number);
    }
    public static void printFactorialNumber(int n){
        int result = 1;
        for(int i = 1;i <= n;i++){
            result *= i;
        }
        System.out.println("THe factor of "+n+ " is:" +result);
    }
}
