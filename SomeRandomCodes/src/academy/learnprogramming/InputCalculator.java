package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {


    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double avg = 0;

        int numberOfLoop = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                numberOfLoop++;
                sum += scanner.nextInt();
                avg = (double)sum/numberOfLoop;


            }
            else{
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
            scanner.nextLine();


        }
    }
}

