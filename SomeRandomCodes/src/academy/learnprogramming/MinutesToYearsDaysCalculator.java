public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            long remin = minutes % 60;
            long redays = ((minutes / 60) / 24) % 365;
            long years = ((minutes / 60) / 24) / 365;
            System.out.println(minutes + " min = " + years + " y and " + redays + " d");
        }

    }
}

