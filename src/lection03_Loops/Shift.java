package lection03_Loops;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] arr1 = new int[(int) (Math.random() * 10 + 5)];
        int[] arr2 = new int[arr1.length];
        int k = 1; // Сдвиг на k элементов
        for (int i = 0; i<arr1.length; i++){
            arr1[i]= (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr1));

            for(int i = 0; i<arr1.length; i++){
                if(i!=arr1.length-1){
                    arr2[i+k] = arr1[i];
                }else{
                    arr2[0]=arr1[i];
                }
            }
        System.out.println(Arrays.toString(arr2));
    }
}
