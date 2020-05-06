public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        int lastDigit;
        int evenNumber=0;

        if(number<0){
            System.out.println(-1);
            return -1;
        }
        while (number>0){
            lastDigit=number%10;

            if(lastDigit%2==0){
                evenNumber+=lastDigit;
                number=number/10;
            }
            number=number/10;
        }


        System.out.println(evenNumber);
        return evenNumber;
    }
}
