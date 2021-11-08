class Ques8{

public static void main(String[] args){


     
        // Question - 8
        System.out.println("--------Question-8------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Thread t = new Thread(() -> numbers.forEach(System.out::println));
        t.start();



    }
 


}


}