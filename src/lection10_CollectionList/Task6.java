package lection10_CollectionList;

import lection10_CollectionList.objects.FrequencyDictionary;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        FrequencyDictionary dictionary = new FrequencyDictionary(text);
        System.out.println("Which word do you want?");
        String word = sc.nextLine();
        dictionary.toCountWords(word);

    }
}
