package lection13_Strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String lastName, firstName, patronymic;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your last name");
        lastName = sc.nextLine();
        System.out.println("Input your first name");
        firstName = sc.nextLine();
        System.out.println("Input your patronymic");
        patronymic = sc.nextLine();
        sc.close();

        String fio = changeFio(lastName, firstName,patronymic);
        System.out.println(fio);
    }
    static String changeFio(String first, String second, String third){
        char f = first.charAt(0);
        char s = second.charAt(0);
        char t = third.charAt(0);
        String fio = f+"."+s+"."+t+".";
        fio = fio.toUpperCase();
        return fio;
    }
}
