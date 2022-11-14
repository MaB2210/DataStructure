package first_java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        float cad;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Canadian Dollar => ");
        cad=sc.nextFloat();

        System.out.println("Your Amount in U.S. Dollar => "+cad*1.3);
    }
}
