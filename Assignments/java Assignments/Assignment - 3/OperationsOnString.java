public class OperationsOnString {

    public static void main(String[] args) {

        String string = "Java String pool refers to collection of Strings which are stored in heap memory";
        String string2 = "Java string pool refers to collection of strings which are stored in heap memory";

        String lowercare = string.toLowerCase();    // lowecase
        String uppercase = string.toUpperCase();    // uppercase

        System.out.println(lowercare);
        System.out.println(uppercase);

        // replace 'a' with '$'

        String newstring="";

        for(int i = 0; i< string.length() ; i++) {
            if (string.charAt(i) == 'a') {
                 newstring = string.replace(string.charAt(i), '$');

            }
        }
        System.out.println(newstring);

        // check if string matches string2 using equalsIgnoreCase() method

        if(string.equalsIgnoreCase(string2)){
            System.out.println("true");
        }                                                     // answer is true
        else{
            System.out.println("false");
        }


        // check using equals() method

        if(string.equals(string2)){
            System.out.println("true");                        // answer is false
        }
        else{
            System.out.println("false");
        }


        // check if string contain "collection" word

        if(string.contains("collection")) System.out.println("true");    // true

    }
}
