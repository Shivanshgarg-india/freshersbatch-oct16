class Ques4{

public static void main(String[] args){

    
        // question -4

        List<String> names = new ArrayList<>();
        names.add("harshit");
        names.add("sanjana");
        names.add("salmankhan");
        names.add("sumit");
        names.add("raj");
        names.add("simran");

    

        names.removeIf(x -> x.length()%2!= 0);
        System.out.println(names);


 


}


}