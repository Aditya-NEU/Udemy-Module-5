public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number > 0 && number%2!=0) {
            return true;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {
        int j = 0;

        if (start > 0 && end>=start && end > 0) {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    j = j + i;
                    i++;
                }
            }

            System.out.println( j);
            return j;
        }

        System.out.println(-1);
        return -1;
    }



}
