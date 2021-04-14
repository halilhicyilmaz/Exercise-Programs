package academy.learnprogramming;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int i =1;

        while (i<11) {

            System.out.println("Enter number #" + i + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                total += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }
        System.out.println("Total = " + total);
        scanner.close();
    }
}