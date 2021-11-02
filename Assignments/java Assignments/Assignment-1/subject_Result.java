import java.util.*;
public class subject_Result {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        //Input all data from user
        System.out.println("Enter the marks of Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of Subject 3");
        int sub3 = sc.nextInt();

        // conditions to be checked
        if(sub1>=61 && sub2 >= 61 && sub3 >= 61){
            System.out.println("==========Passed==========");
        }
        else if( sub1+sub2 >= 122 || sub2+sub3 >= 122 || sub3+sub1 >= 122){
            System.out.println("==========Promoted==========");
        }
        else{
            System.out.println("===========failed==========");
        }
    }
}
