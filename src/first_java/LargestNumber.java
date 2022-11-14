package first_java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number => ");
        num1=sc.nextInt();

        System.out.print("Enter Second Number => ");
        num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is the Greatest Number.");
        }
        else{
            System.out.println(num2+" is the Greatest Number.");
        }
    }
}
