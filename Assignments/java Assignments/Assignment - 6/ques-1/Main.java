import java.util.*;

public class Main {

    public static void main(String[] args) {
        Contacts c1 = new Contacts("Adarsh" , 898989989,"bc@kdf.com",Gender.Male);
        Contacts c2 = new Contacts("sima" , 384783784,"bg@kdf.hjj",Gender.Female);
        Contacts c3 = new Contacts("lavi" , 987678768,"huu@kdf.ff",Gender.Female);
        Contacts c4 = new Contacts("Aditya" , 234544565,"juk@kdf.vd",Gender.Male);
        Contacts c5 = new Contacts("kittu" , 767899987,"ccd@kdf.comjj",Gender.Female);

        TreeMap<Long , Contacts> details = new TreeMap<>(Collections.reverseOrder());  // store in descending order
        details.put(c1.getPhonenumber() , c1);
        details.put(c2.getPhonenumber() , c2);
        details.put(c3.getPhonenumber() , c3);
        details.put(c4.getPhonenumber() , c4);
        details.put(c5.getPhonenumber() , c5);


        System.out.println("-------set of all keys------------");
        System.out.println();
        for(Map.Entry<Long,Contacts> e : details.entrySet()){
            System.out.println("Phone Number : " +e.getKey());
        }

        System.out.println();
        System.out.println("-------set of all values------------");
        System.out.println();

        for(Map.Entry<Long,Contacts> e : details.entrySet()){
            System.out.println("Contacts : " +e.getValue());
        }

        System.out.println();
        System.out.println("-----key-pair-----------------");
        System.out.println();

        for(Map.Entry<Long,Contacts> e : details.entrySet()){
            System.out.println("Contacts : " +e.getValue());
        }

    }
}
