package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }

            System.out.println("Your name is " + name);

        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
