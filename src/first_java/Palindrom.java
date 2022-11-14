package first_java;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        int rem, sum=0, temp, num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Number => ");
        num=sc.nextInt();

        temp=num;

        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        if(temp==sum){
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is NotPalindrom");
        }



    }
}
