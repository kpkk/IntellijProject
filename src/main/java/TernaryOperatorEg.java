import java.util.Scanner;

public class TernaryOperatorEg {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int max=a>b?a:b;
        System.out.println(max);


        System.out.println("biggest number between a and b is "+max);



    }
}
