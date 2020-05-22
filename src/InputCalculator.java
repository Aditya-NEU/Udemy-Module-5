import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the numbers for which you need to calculate sum and average");

        int sum=0;
        int counter=0;
        int avg=0;
        boolean isAnInt =scanner.hasNextInt();
        if(isAnInt){
            while (true){
                boolean hasNextInt= scanner.hasNextInt();
                if (hasNextInt){
                    int number=scanner.nextInt();
                    sum+=number;
                    counter++;
                    avg=sum/counter;
                    scanner.nextLine();
                }
                else {
                    System.out.println("SUM= "+sum +" ,AVG= "+avg);
                    break;
                }

            }
        }


//        System.out.println("The average of numbers is :"+avg);

        scanner.close();

    }

}
