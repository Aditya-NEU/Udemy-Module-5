public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if(number<1){
            System.out.println(false);
            return false;
        }
        int factor=0;
        for(int i=1; i<=number/2;i++){

            if(number%i==0){
                factor+=i;
            }
        }
        if(factor==number){
            System.out.println(true);
            return true;
        }
        return false;
    }


}


