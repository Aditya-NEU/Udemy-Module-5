public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0 && year >= 1 && year <= 9999) {
           // System.out.println(true);
            return true;
        } else {
            //System.out.println(false);
            return false;
        }
    }

    public static double getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            boolean leapVerification = isLeapYear(year);
            if (leapVerification == true) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 12:
                    case 10:
                    case 8:
                    case 7:
                        System.out.println(31);
                        return 31;
                    case 2:
                        System.out.println(29);
                        return 29;
                    case 4:
                    case 6:
                    case 11:
                    case 9:
                        System.out.println(30);
                        return 30;
                }
            }
            else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 12:
                    case 10:
                    case 8:
                    case 7:
                        System.out.println(31);
                        return 31;
                    case 2:
                        System.out.println(28);
                        return 28;
                    case 4:
                    case 6:
                    case 11:
                    case 9:
                        System.out.println(30);
                        return 30;
                }

            }

        }
        return 1;
    }
}
