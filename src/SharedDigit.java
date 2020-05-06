public class SharedDigit {

    public static boolean hasSharedDigit(int number1 , int number2) {

        if (number1 <10 || number1 > 99 && number2 < 10 || number2 > 99) {
            System.out.println(false);
        }
        else {

            int a = number1 % 10;
            int b = number1 / 10;
            int c = number2 % 10;
            int d = number2 / 10;


            if (a == c || a == d || b == c || b == d) {
                System.out.println(true);
                return true;
            }

        }
        return false;
    }
}
