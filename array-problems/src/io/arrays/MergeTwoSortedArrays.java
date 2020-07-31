package io.arrays;

public class MergeTwoSortedArrays {


    private static int[] merge(int[] intArr1, int[] intArr2){


        int[] result = new int[intArr1.length + intArr2.length];
        int i=0, j=0, k=0;

      while(i< intArr1.length && j<intArr2.length){


          if(intArr1[i]< intArr2[j]){
                result[k++] = intArr1[i++];
          }else{
              result[k++] = intArr2[j++];
          }

      }

      while (i< intArr1.length){
          result[k++] = intArr1[i++];
      }

      while (j<intArr2.length){
          result[k++]=intArr2[j++];
      }


        return result;

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
