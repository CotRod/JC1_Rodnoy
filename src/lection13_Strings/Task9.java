package lection13_Strings;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a roman numeral");
        String str = sc.nextLine();
        sc.close();
        str = str.toUpperCase();
        int num=0;
        char [] rimsk = str.toCharArray();
        int []nums= new int[rimsk.length];
        for(int i =0; i<rimsk.length;i++){
            if(str.charAt(i)=='M'){
                nums[i]=1000;
            }
            if(str.charAt(i)=='D'){
                nums[i]=500;
            }
            if(str.charAt(i)=='C'){
                nums[i]=100;
            }
            if(str.charAt(i)=='L'){
                nums[i]=50;
            }
            if(str.charAt(i)=='X'){
                nums[i]=10;
            }
            if(str.charAt(i)=='V'){
                nums[i]=5;
            }
            if(str.charAt(i)=='I'){
                nums[i]=1;
            }
        }
        for (int i = nums.length-1; i>=0;i--){
            if(i==0){
                if(nums.length==1){
                    num = nums[0];
                } else if(nums.length%2==0){
                    break;
                }else if(nums[0]>=nums[1]){
                    num+=nums[0];
                } else{
                    num-=nums[0];
                }
            }else if(nums[i]>nums[i-1]){
                num+=(nums[i]-nums[--i]);
            }else{
                num+= (nums[i]+nums[--i]);
            }
        }
        System.out.println(num);
    }
}
