import java.util.Scanner;

public class BiggestNumberinTwo {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int a = s.nextInt();
        System.out.println("enter b value");
        int b = s.nextInt();

        if(a>b){
            System.out.println(a+" is bigger number");
        }
        else {
            System.out.println(b+" is bigger number");
        }


    }
}
