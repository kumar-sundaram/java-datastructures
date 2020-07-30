package io.arrays;

public class RemoveEvenIntegers {


/*
O(n) - time and space complexity

 */
    private static int[] bruteForceApproach(int[] arr){

        //find out number of odd numbers
        int counter = 0;

        for (int anArr : arr) {
            if (anArr % 2 != 0) {
                counter++;
            }
        }

        int[] result = new int[counter];
        counter=0;

        for (int anArr : arr) {
            if (anArr % 2 != 0) {
                result[counter++] = anArr;
            }
        }

        return result;

    }

    private static void printArray(int[] arr){

        for (Integer in: arr
             ) {
            System.out.println("in = " + in);
        }

    }

    public static void main(String[] args) {


        int[] arr= {1,5,10,2,6,3,11,15};
        printArray(bruteForceApproach(arr));




    }
}
