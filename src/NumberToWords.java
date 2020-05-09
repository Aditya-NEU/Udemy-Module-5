import com.sun.org.apache.bcel.internal.util.ClassStack;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
        }

        int lastDigit;
        int reverseNumber = reverse(number);
       int digitCount = getDigitCount(number);

        System.out.println(number);

       while(reverseNumber!=0){
        int newNumber = reverseNumber % 10;
        switch (newNumber) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }

        reverseNumber = reverseNumber / 10;
    }

}
    public static int reverse(int number){
        int sum=0;
        int lastDigit;

        while(number!=0){

            lastDigit=number%10;
            sum=(sum*10)+lastDigit;
            number=number/10;
        }
    //    System.out.println(sum);
            return sum;

    }

    public static int getDigitCount(int number){
        int digitCount=0;

        if(number<0){
            System.out.println("Invalid number");
            return -1;
        }

        while (number!=0){
            digitCount++;
            number=number/10;
        }

     //   System.out.println(digitCount);
        return digitCount;
    }

}






