public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigBag= 5;
        int smallBag=1;

        int sum1= bigBag*bigCount;
        int sum2=smallBag*smallCount;

        if(sum1+sum2==goal  ){
            System.out.println(true);
            return true;
        }

        else if(sum2>goal && sum1<goal ){
            System.out.println(true);
            return true;
        }
        else if(sum1+sum2>goal && sum1<goal){
            System.out.println(true);
            return true;
        }

        System.out.println(false);
        return false;

    }
}
