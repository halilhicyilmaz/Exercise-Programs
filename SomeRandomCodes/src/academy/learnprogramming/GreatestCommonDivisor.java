public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10){
            return -1;

        }
        int devider = 1;
        for(int i = 1 ; i <= first ; i++){

            if(first % i == 0 && second % i == 0){
                devider = i;
            }
        }
        return devider;

    }
}
