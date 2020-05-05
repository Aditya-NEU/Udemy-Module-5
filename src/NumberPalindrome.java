public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int sum=0;
        int lastDigit;
        int temp ;
        temp=number;

        while(number!=0){
            lastDigit=number%10;
            sum=(sum*10)+ lastDigit;
            number=number/10;
        }
        if(temp==sum){

            System.out.println(true);
            return true;
        }
        else
            System.out.println(false);
        return false;
    }



}
