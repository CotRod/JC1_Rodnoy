package lection10_CollectionList.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyDictionary {

    List<String> words;

    public FrequencyDictionary(String s) {

        s = s.trim();
        s = s.toLowerCase();
        s = s.replaceAll("[\\d\\.\\^\\$\\*\\+\\?\\{\\[\\]\\\\\\|\\(\\)\\,\\/\\!\\-\\:\\;\"\\']", "");
        String w[] = s.split("\\s");
        words = new ArrayList<>();
        for (int i = 0; i < w.length; i++) {
            if (w[i].length() != 0) {
                words.add(w[i]);
            }
        }
    }

    public void toCountWords(String word) {
        System.out.println("The frequency of the word " + word + " is: " + Collections.frequency(words, word));
    }
}
