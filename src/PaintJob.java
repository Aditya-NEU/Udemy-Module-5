public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        double wallArea=0;
        double bucketRequired=0;
        double finalBucketRequired=0;


        if(width<=0|| height<=0|| areaPerBucket<=0){
            System.out.println(-1);
         return -1;
        }

        wallArea=width*height;
     //   System.out.println("WallArea="+wallArea);

        bucketRequired=wallArea/areaPerBucket;

      //  System.out.println(bucketRequired);

        finalBucketRequired=bucketRequired-extraBuckets;
        System.out.println(Math.ceil(finalBucketRequired));

        return (int) Math.ceil(finalBucketRequired);

    }

    public static int getBucketCount(double width,double height, double areaPerBucket){

        double wallArea=0;
        double bucketRequired=0;


        if(width<=0|| height<=0|| areaPerBucket<=0){
            System.out.println(-1);
            return -1;
        }

        wallArea=width*height;

        bucketRequired=wallArea/areaPerBucket;

        System.out.println(Math.ceil(bucketRequired));
        return (int) Math.ceil(bucketRequired);

    }

    public static int getBucketCount(double area, double areaPerBucket){

        double bucketsRequired;

        if(area<=0){
            System.out.println(-1);
            return -1;
        }

        bucketsRequired=area/areaPerBucket;

        System.out.println(Math.ceil(bucketsRequired));

        return (int) Math.ceil(bucketsRequired);



    }



}
