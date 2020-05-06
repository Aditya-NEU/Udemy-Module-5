public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int sum;

        if(number<0){
            System.out.println(-1);
            return -1;
        }

        else {
            sum=number%10;
            while (number>=10){
                number=number/10;
            }
            System.out.println(sum+number);
            return sum+number;

        }

    }

}
