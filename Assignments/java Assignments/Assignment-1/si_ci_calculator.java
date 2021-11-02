import java.util.*;
public class si_ci_calculator {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        int pri =  sc.nextInt();
        System.out.println("Enter the Intrest :");
        int intrest = sc.nextInt();
        System.out.println("Enter the number of years :");
        int year = sc.nextInt();

        double SI = (pri * intrest * year) / 100;
        System.out.println("Simple Intrest - " + SI);

        double CI = pri * (Math.pow((1 + intrest / 100), year));

        System.out.println("Compound Interest - "+ CI);
    }
}
