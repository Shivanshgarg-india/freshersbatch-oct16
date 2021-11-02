public class armstrong_numbers {

    public static void main(String[] args) {
        int j;

        for(j=100;j<=999;j++){
            arm_check(j);
        }

    }
    public static void arm_check(int num){
        int temp , number, total = 0 , i ;
        number = num;
        while(number != 0 ) {
            temp = number % 10;
            total = total + (temp * temp * temp);
            number = number / 10;
        }
            if (total == num) {
                i = num;
                System.out.print(i + " ");

            } else {
                return;
            }

    }
}