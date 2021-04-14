package academy.learnprogramming;

import java.util.Scanner;



public class SortedArray {


    public static int[] getIntegers(int capacity){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for (int i = 0; i<capacity; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sorted = array;
        boolean a = true;
        while(a){
            a=false;
            for(int i=0; i<sorted.length-1; i++){
                if (sorted[i]<sorted[i+1]){
                    int temp = sorted[i];
                    sorted[i]=sorted[i+1];
                    sorted[i+1]=temp;
                    a=true;
                }
            }

        }
        return sorted;
    }

}








//    public static void main(String[] args) {
//
//        int[] myIntegers = getIntegers();
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);
//
//
//
//    }
//    public static int[] getIntegers(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter integer values:\r");
//        int i=0;
//        int[] a =new int[10];
//
//        while(scanner.hasNextInt()) {
//            //array=new int[i+1];
//            a[i] = scanner.nextInt();
//            i++;
//        }
//
//        int aSize = 0;
//        for(int k = 0; k < a.length; k++) {
//
//            if(a[k] == 0)
//                break;
//
//            aSize = aSize +1;
//        }
//
//        int[] b =new int[aSize];
//        for(int j=0; j<aSize; j++) {
//            b[j] = a[j];
//        }
//
//        System.out.println(aSize);
//
//        return b;
//    }
//    public static void printArray(int[] array){
//        for(int i=0; i<array.length; i++){
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//    public static int[] sortIntegers(int[] array) {
//        int[] sorted = array;
//        boolean a = true;
//        while(a){
//            a=false;
//            for(int i=0; i<sorted.length-1; i++){
//                if (sorted[i]<sorted[i+1]){
//                    int temp = sorted[i];
//                    sorted[i]=sorted[i+1];
//                    sorted[i+1]=temp;
//                    a=true;
//                }
//            }
//
//        }
//        return sorted;
//    }
//
//}