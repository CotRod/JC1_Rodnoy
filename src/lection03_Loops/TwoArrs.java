package lection03_Loops;

import java.util.Arrays;

public class TwoArrs {
    public static void main(String[] args) {
        int[] arr1 = new int[(int) (Math.random() * 10+1)];
        int size1 = arr1.length;
        int[] arr2 = new int[(int) (Math.random() * 10+1)];
        int size2 = arr2.length;
        int size3 = size1+size2;
        int[] arr3 = new int[size3];
        int bigger;
        if(size1>size2) bigger=size1; else bigger = size2;
        int common = size3 - bigger;

        for (int i = 0; i < size1; i++) {
            arr1[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for(int j = 0, i =0; j<bigger; j++, i++) {
            while (j<common) {
                if (arr1[j] < arr2[j]) {
                    arr3[i] = arr1[j];
                    arr3[++i] = arr2[j];
                    i++;
                    j++;
                } else {
                    arr3[i] = arr2[j];
                    arr3[++i] = arr1[j];
                    i++;
                    j++;
                }
            }
            if(size1>size2){
                arr3[i]= arr1[j];
            }else if(size2>size1){
                arr3[i]= arr2[j];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
