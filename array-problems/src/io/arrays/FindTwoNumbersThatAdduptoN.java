package io.arrays;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array and a number "n", find two numbers
from the array that sums up to "n".
 */
public class FindTwoNumbersThatAdduptoN {


    //brute force.
    //Run through a loop and for each element to end
    // Run through a child loop that starts for next element to end
    // Find element from parent & element from child loop sums up to n
    // if it matches, return the elements.
    private static int[] findTwoNums(int[] arr, int n) {

        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == n) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
        // if none of the elements adds up to n, return original array
        return arr;

    }

    //O(n log n) -how???
    private static int[] findTwoNumsFromSortedArray(int[] arr, int n){

        int[] result = new int[2];

        // learn quick sort
        Arrays.sort(arr);

        int pointer1 = 0;
        int pointer2 = arr.length-1;
        int sum;

        while (pointer1!=pointer2){

            sum = arr[pointer1] + arr[pointer2];
            if(sum>n){
                pointer2--;
            }else if(sum<n){
                pointer1++;
            }else{
                result[0] = arr[pointer1];
                result[1] = arr[pointer2];
                return result;
            }

        }



        return arr;
    }

    //O(1)
    private static int[] findTwoNumsFromHashTable(int[] arr, int n){


        // create a map, that has summed values as keys and respective pairs as values.
        // if the map has n as key, return the pair.
        HashMap<Integer, int[]> map= new HashMap<>();


        // TODO: 7/31/20 : How to create such a map

       /* if(map.containsKey(n)){
            return map.get(n);
        }*/

        // if none of the elements adds up to n, return original array
        return arr;

    }



    public static void main(String[] args) {

        int[] arr = {5,10,15};
        int[] arr2 = {5,7,2,4};
        int[] arr3 = {1,4,8,11,13};

        printArr(findTwoNums(arr, 15));

        printArr(findTwoNums(arr2, 7));
        printArr(findTwoNums(arr3, 11));

        System.out.print("With HashMap:::::");


        printArr(findTwoNumsFromHashTable(arr, 15));

        printArr(findTwoNumsFromHashTable(arr2, 7));
        printArr(findTwoNumsFromHashTable(arr3, 11));

        System.out.print("With Sorted Array :::::");


        printArr(findTwoNumsFromSortedArray(arr, 15));

        printArr(findTwoNumsFromSortedArray(arr2, 7));
        printArr(findTwoNumsFromSortedArray(arr3, 11));


    }

    private static void printArr(int[] arr){

        System.out.print("{");

        for (int anArr: arr
        ) {
            System.out.print(anArr);
            System.out.print(",");

        }

        System.out.print("}");


    }





}
