public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else return (year % 4 == 0) && (year % 100 != 0);
    }



    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }

        if (month == 2 && isLeapYear(year)){
            return 29;
        }

    int[] myNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    return myNum[month-1];

    }
}
