public class OperationsOnStringBuffer {
    public static void main(String[] args) {

        // append function of string buffer

        StringBuffer string = new StringBuffer("StringBuffer");

        string.append(" is a peer class of String");
        string.append(" that provides much of ");
        string.append("the functionality of strings.");

        System.out.println(string);

        // insert any word at specific position

        String st3 = "It is use to _ at the specific index position";

        int index = st3.indexOf('_');
        String sb = st3.substring(0,index)+ "insert text" +st3.substring(index+1);

        // reverse string

        StringBuffer st2 = new StringBuffer("This methos returns the reversed object on which it was called ");

        System.out.println(st2.reverse());
    }
}
