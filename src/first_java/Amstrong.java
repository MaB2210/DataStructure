package first_java;

import java.util.Scanner;

public class Amstrong {
    public static boolean isAmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;

        temp=n;

        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0)
        {
            last=temp%10;
            sum += (Math.pow(last,digits));
            temp=temp/10;
        }
        if (n==sum){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter your number to Check Amstrong => ");
        num=sc.nextInt();

        if(isAmstrong(num)){
            System.out.println(num+" is an Amstrong Number.");
        }
        else{
            System.out.println(num+" is Not an Amstrong Number.");
        }
    }
}
