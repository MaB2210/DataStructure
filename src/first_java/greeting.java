package first_java;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name => ");
        name=scanner.next();

        System.out.println("Hello " + name + " welcome to Github");
    }
}
