package first_java;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {

        float principle , time, rate;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle => ");
        principle=sc.nextFloat();

        System.out.print("Enter Time => ");
        time = sc.nextFloat();

        System.out.print("Enter Rate => ");
        rate = sc.nextFloat();

        System.out.println(" Your Simple Intrest for given data is $"+ (principle*time*rate)/100);

    }

}
