package academy.learnprogramming;

import java.util.Objects;
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            //int absa = scanner.nextInt(); scanner.next kısmı ile ilk karşılastıgı yere atıyor

            if(hasNextInt){
                int number = scanner.nextInt();
                if( min > number ){
                 min = number ;}
                if( max < number){
                    max = number;
                }
            }
            else {
                System.out.println("min = " + min + " max = " + max);
                break;
            }
            scanner.nextLine();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number");

            try {
                int number = Integer.parseInt(scanner.nextLine());
                if( min > number ){
                    min = number ;}
                if( max < number){
                    max = number;
                }
            }catch (NumberFormatException e){
                System.out.println("min = " + min + " max = " + max);
                break;
            }
        }
    }
}
