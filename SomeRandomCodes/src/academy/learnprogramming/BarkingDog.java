package academy.learnprogramming;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) {
            return barking;
        } else {
            return false;
        }
    }
}
