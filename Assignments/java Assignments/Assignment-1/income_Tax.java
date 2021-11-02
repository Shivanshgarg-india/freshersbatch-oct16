import java.util.*;
public class income_Tax {
    public static void main(String[] Args){
        System.out.println("Enter your CTC :- ");
        double tax;

        //take ctc from use
        Scanner sc = new Scanner(System.in);
        double ctc = sc.nextDouble();

        // Now check conditions
        if(ctc >= 0 && ctc <= 180000 ){
            System.out.println("You are on Slab A your tax is : nil");
        }
        else if(ctc >= 181001 && ctc <= 300000 ){
            tax = ( ctc * 10 ) / 100;
            System.out.println("You are on Slab B your tax is : " + tax );
        }

        else if(ctc >= 300001 && ctc <= 500000 ){
            tax = ( ctc * 20 ) / 100;
            System.out.println("You are on Slab C your tax is : " + tax );
        }


        else if (ctc >= 500001 && ctc <= 1000000 ){
            tax = ( ctc * 30 ) / 100;
            System.out.println("You are on Slab D your tax is : " + tax );
        }



    }
}
