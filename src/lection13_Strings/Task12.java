package lection13_Strings;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String str = sc.nextLine();
        sc.close();
        int parts=2;
        for(int i = 4; i<str.length();i++){
            if(str.length()%i==0){
                parts=i;
                break;
            }
        }
        String [] arr;
        arr = toArr(str,parts);
        toShowArr(arr);


    }
    private static String[] toArr(String str, int i){
        int elems = str.length()/i;
        String [] array = new String[i];
        for(int j=0;j<i;j++){
            if(j==i-1){
                array[j]=str.substring(j*elems);
            }else {
                array[j] = str.substring(j * elems, (j * elems) + elems);
            }
        }
        return array;
    }

    private static void toShowArr(String [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println("Elem["+i+"] = "+arr[i]);
        }
    }
}
