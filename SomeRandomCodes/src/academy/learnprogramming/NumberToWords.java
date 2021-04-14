public class NumberToWords {
    public static void numberToWords(int a){
        if (a < 0){
            System.out.println("Invalid Value");
        }
        int b = reverse(a);
        for (int i = 0; i<getDigitCount(a) ; i++){

            switch (b % 10){

                case (1):
                    System.out.println("One");
                    break;
                case (2):
                    System.out.println("Two");
                    break;
                case (3):
                    System.out.println("Three");
                    break;
                case (4):
                    System.out.println("Four");
                    break;
                case (5):
                    System.out.println("Five");
                    break;
                case (6):
                    System.out.println("Six");
                    break;
                case (7):
                    System.out.println("Seven");
                    break;
                case (8):
                    System.out.println("Eight");
                    break;
                case (9):
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            b = b/10;
        }
    }
    public static int reverse (int number){
        int reverse = 0;
        for (int a = number; a != 0 ; a=a/10){
            reverse = reverse*10;
            reverse = reverse + a % 10;
        }
        return reverse;

    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return -1;
        }
        for (int i = number; i>0 ; i/=10){
            count++;

        }
        if ( count == 0){
            count = 1;
        }
        return count;
    }

}
