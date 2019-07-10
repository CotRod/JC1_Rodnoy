package lection03_Loops;

import java.util.Arrays;

public class Linear {

        private static int[] linearize(int[][] arr){
            int size = arr.length * arr[0].length;
            int[] narray = new int[size];
            int i = 0;
            for (int[] a : arr) {
                for (int b : a) {
                    narray[i]= b;
                    i++;
                }
            }
            return narray;
        }

    public static void main(String[] args) {

        int[][] arr = {
        {3,4,7},
        {2,5,1},
        {1,3,8},
        };
        int [] arr2 = linearize(arr);
        System.out.println(Arrays.toString(arr2));



    }
}
