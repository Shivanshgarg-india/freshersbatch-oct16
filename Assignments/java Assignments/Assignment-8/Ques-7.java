class Ques7{

public static void main(String[] args){

       // Question - 7

        System.out.println("--------Question-7------------");

        Map<Integer,String> map = new HashMap<>();
        map.put(1," Hello, ");
        map.put(2," Hey, ");
        map.put(3," How ");
        map.put(4," are ");
        map.put(5," you ?");

        StringBuilder stringBuilder = new StringBuilder();

        for(Map.Entry<Integer,String> e : map.entrySet()){
            stringBuilder.append(e.getKey().toString()).append(e.getValue());
        }
        System.out.println(stringBuilder);

 


}


}