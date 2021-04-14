package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate number of elements :\r");

        if(scanner.hasNextInt()) {
            int elements = scanner.nextInt();
            readElements(elements);
            return scanner.nextInt();
        }

        return 0;
    }
    private static int[] readElements(int a){
        int[] array = new int [a];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate elements :\r");
        for(int i = 0; i<a;i++){
            array[i]=scanner.nextInt();
        }
        findMin(array);
        return array;
    }
    private static int findMin(int[] array){
        int a = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            if(a>array[i]){
                a=array[i];
            }
        }
        System.out.println("Smallest number is " + a + " in the array");
        return a;


    }
}
