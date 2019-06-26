import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int a = s.nextInt();
        if(a%2==0){
            System.out.println("given number is an even number");
        }
        else if(a%2==1){
            System.out.println("given number is an odd number");
        }
        else{
            System.out.println("given number is not a valid number");
        }
    }
}
