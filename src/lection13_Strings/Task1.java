package lection13_Strings;

public class Task1 {
    public static void main(String[] args) {
        String str1 = new String();
        StringBuilder strB = new StringBuilder();
        long timer1 = System.nanoTime();
        for(int i = 1; i<10;i++){
            String str = "String"+i;
            str1 += str;
        }
        timer1 = System.nanoTime()-timer1;
        long timer2 = System.nanoTime();
        for(int i = 1; i<10;i++){
            String str = "String"+i;
            strB.append(str);
        }
        timer2 = System.nanoTime()-timer2;
        System.out.println(str1);
        System.out.println(strB);
        System.out.println(timer1);
        System.out.println(timer2);
    }
}
