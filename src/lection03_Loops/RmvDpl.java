package lection03_Loops;

import java.util.Arrays;

public class RmvDpl {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 10 + 5)];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int [] arr2 = new int[(arr.length - count)];
        count=0;
        for (int value : arr) {
            if (value != 0) {
                arr2[count] = value;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
