package academy.learnprogramming;


public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;

        }
        int a = 0;


        for (int i = 2; i <= number; i++) {
            if ((number % i) == 0) {
                int b = 0;
                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        b = 1;

                        break;
                    }

                }
                if (b == 0) {
                    a = i;
                }
            }

        }
        return a;
    }
}
