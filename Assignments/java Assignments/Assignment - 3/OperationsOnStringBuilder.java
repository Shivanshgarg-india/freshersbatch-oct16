public class OperationsOnStringBuilder {

    public static void main(String[] args) {



        // append function of string buffer

        StringBuilder string = new StringBuilder("StringBuffer");
        string.append(" is a peer class of String");
        string.append(" that provides much of ");
        string.append("the functionality of strings.");

        System.out.println(string);

        // insert any word at specific position

        String st = "It is use to _ at the specific index position";

        int index = st.indexOf('_');
        String sb = st.substring(0,index)+ "insert text" +st.substring(index+1);

        System.out.println(sb);
        
        // reverse string

        StringBuilder st2 = new StringBuilder("This methos returns the reversed object on which it was called ");


        System.out.println(st2.reverse());
    }
}
