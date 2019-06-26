import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        System.out.println("enter any year");
        Scanner s=new Scanner(System.in);
        int year = s.nextInt();

        if((year%4==0&&year%400==0)||(year%100!=0)){
            System.out.println("given year: "+year+" is a leap year");
        }else
            System.out.println("given year "+year+"is a non-leap year");
    }
}
