class Ques1 {

public static void main(String[] args){

// question - 1

        System.out.println("What operation you want to perform " +
                "1 - Addtion " +
                "2 - Substraction " +
                "3 - Multiplication " +
                "4 - Division , make your choice.");
        int choice = input.nextInt();

        switch (choice){
            case 1 :
                int case1 = ArithmeticOperations.Addition.apply(input.nextInt(),input.nextInt());
                System.out.println(case1);
                break;
            case 2 :
                int case2 = ArithmeticOperations.Substraction.apply(input.nextInt(),input.nextInt());
                System.out.println(case2);
                break;
            case 3 :
                int case3 = ArithmeticOperations.Multiplictaion.apply(input.nextInt(),input.nextInt());
                System.out.println(case3);
                break;
            case 4 :
                int case4 = ArithmeticOperations.Division.apply(input.nextInt(),input.nextInt());
                System.out.println(case4);
                break;
            default:
                System.out.println("Entered wrong choice");
                System.exit(0);


        }

}

}
class ArithmeticOperations {

    static BinaryOperator<Integer> Addition = Integer::sum;
    static BinaryOperator<Integer> Multiplictaion = (x,y) -> {return x*y; };
    static BinaryOperator<Integer> Substraction = (x,y) -> {return x-y; };
    static BinaryOperator<Integer> Division = (x,y) -> {return x/y ; };

}