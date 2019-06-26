import java.util.Scanner;

public class SwitchPractise {

    public static void main(String[] args) {

        System.out.println("enter your choice of drink");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        String drink = s.nextLine();

        switch (drink){
            case "tea": System.out.println("enjoy your tea");
            break;
            case "coffee": System.out.println("enjoy your coffee");
            break;
            case "beer": System.out.println("enjoy your beer");
            break;
            case "water": System.out.println("enjoy glass of water ");
            break;
            default:System.out.println("invalid selection");



        }


    }
}
