public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        int a =number1%10;
        int b= number2%10;
        int c= number3%10;

        if(number1<10 || number1>1000 && number2<10 || number2>1000){
            System.out.println(false);
            return false;
        }

        else{

            if(a==b ||b==c|| c==a){
                System.out.println(true);
                return true;
            }
        }

        System.out.println(false);
        return false;


    }
}
