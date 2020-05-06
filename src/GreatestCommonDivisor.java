public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor (int first, int second){

        if(first<10 || second<10){
            System.out.println(-1);
            return -1;
        }

        int halfFirst= first/2;
        int halfSecond= second/2;
        int gcd=0;


        for(int i=1;i<=halfFirst && i<halfSecond;i++){

            if(first%i==0 && second%i==0){
                gcd=i;

            }
        }

        System.out.println(gcd);
        return gcd;

    }
}
