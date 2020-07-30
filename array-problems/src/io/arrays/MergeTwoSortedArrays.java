package io.arrays;

public class MergeTwoSortedArrays {


    private static int[] merge(int[] intArr1, int[] intArr2){


       /*
           For each element in intArr1, compare each element in intArr2,
        */

        return new int[intArr1.length + intArr2.length];

    }


    private static void print(int[] arr){

        System.out.print("{");

        for (int anArr: arr
        ) {
            System.out.print(anArr);
            System.out.print(",");

        }

        System.out.print("}");


    }

    public static void main(String[] args) {

        int[] intArr1 = {1,3,4,5};
        int[] intArr2={6,7,8};


        print(intArr1);
        print(intArr2);

        print(merge(intArr1, intArr2));


    }
}
