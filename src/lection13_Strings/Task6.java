package lection13_Strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a text");
        StringBuilder strBldr = new StringBuilder(sc.nextLine());
        sc.close();
        System.out.println(strBldr);
        int start=0, end=0;
        for(int i = 0; i<strBldr.length()-1;i++){
            if(strBldr.charAt(i)== strBldr.charAt(i+1)){
                start=i;
                for (int j = i+1; j<strBldr.length(); j++){
                    if(strBldr.charAt(i)!= strBldr.charAt(j)){
                        end = j-1;
                        break;
                    }
                    if(j==strBldr.length()-1){
                        end = j;
                        break;
                    }
                }
            }
            if(end>0) {
                strBldr.delete(start, end);
                end=0;
            }
        }
        System.out.println(strBldr);
    }
}
