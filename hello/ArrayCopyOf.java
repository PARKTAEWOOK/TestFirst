package hello;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};

        for(int i : array1){

        }

        int[] array2 = Arrays.copyOf(array1, 3);
        for(int i : array2){
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("dddd");

        int[] array3 = Arrays.copyOfRange(array1, 1,4);
        for(int i : array3){
            System.out.print(i);
        }


    }
}
