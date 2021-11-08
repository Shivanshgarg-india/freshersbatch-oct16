class Ques3{

public static void main(String[] args){

    
// Question- 3

        System.out.println("-----Question-3----------");

        // consumer
        Consumer<Integer> func = x-> System.out.println(x+1);
        func.accept(8);

        Consumer<String> func1 = System.out::println;
        func1.accept("Hey this is the Consumer Interface");

        // supplier
        getText(()->"hello all");

        //predicate
        Predicate<Integer> func3 = x -> x > 5;
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = l.stream().filter(func3).collect(Collectors.toList());
        System.out.println(collect);

        // Predaicate with &&
        List<Integer> clist = l.stream().filter(x -> x >5 && x<8).collect(Collectors.toList());
        System.out.println(clist);

 

}

// supplier interface method
    public static void getText(Supplier<String> text){
        System.out.println(text.get());
    }



}