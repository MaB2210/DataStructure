package first_java;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Number here => ");
        num=scanner.nextInt();

        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }

    }
}
