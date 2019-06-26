import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b = a << 2;
        System.out.println("value after left shift is"+b);
        int c = a >> 2;
        System.out.println("value after left shift is"+c);


    }
}
