package ie.atu;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        int [] anArray;
        anArray = new int[10];
        System.out.println("please enter number");
        Scanner input = new Scanner(System.in);
        anArray[10] = input.nextInt();
        System.out.println(+ anArray[10]);


        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int indexvalue = 0;
        for (int number : anArray){
            System.out.println("Element at index" + number + " : " + indexvalue);
            indexvalue++;
        }

       try {
           System.out.println("please enter number");
           Scanner input = new Scanner(System.in);
           anArray[10] = input.nextInt();
           System.out.println(+ anArray[10]);
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Array is out of bounds");
       }

    }


}

