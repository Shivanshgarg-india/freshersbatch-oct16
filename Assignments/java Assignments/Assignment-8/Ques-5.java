class Ques5{

public static void main(String[] args){

    
     // Question - 5

        System.out.println("---------Question-5---------");
        List<String> stringList = new ArrayList<>();
        stringList.add("johnny");
        stringList.add("tameer");
        stringList.add("rashul");
        stringList.add("asees");
        stringList.add("kamran");

        StringBuilder sb = new StringBuilder();

        Consumer<Character> createString = s->
        {   sb.append(s);
            System.out.println(sb);
        };
        for (String st: stringList) {
            createString.accept(st.charAt(0));
        }
 


}


}