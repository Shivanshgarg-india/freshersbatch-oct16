class Ques6{

public static void main(String[] args){

        // Question - 6

        System.out.println("-----------Question-6-----------");

        List<String> stringList = new ArrayList<>();
        stringList.add("johnny");
        stringList.add("tameer");
        stringList.add("rashul");
        stringList.add("asees");
       stringList.add("kamran");

        UnaryOperator<String> uppercase = s -> s.toUpperCase();
        for (String str : stringList) {
            System.out.println(uppercase.apply(str));
        }

 


}


}