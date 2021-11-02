import java.util.Scanner;

public class LengthOfString {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string to find its length");
        String string = s.next();
        System.out.println("Length of the string is " + string.length());
    }
}

