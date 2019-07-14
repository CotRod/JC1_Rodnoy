package lection11_CollectionSetMap;

import java.util.*;

public class Task1_2 {
    public static void main(String[] args) {
        List <Integer> test = new ArrayList<>();
        System.out.println(countUnique(test));
        Integer[] nums = {3, 7, 3, 1, 2, 3, 7, 2, 15, 15};
        test.addAll(Arrays.asList(nums));
        System.out.println(countUnique(test));

//        Task4
        Map<String,String> test1 = new HashMap<>();
        test1.put("Marty","Stepp");
        test1.put("Stuart","Reges");
        test1.put("Jessica","Miller");
        test1.put("Amanda","Camp");
        test1.put("Hal","Perkins");
        System.out.println(isUnique(test1)); //true

        Map<String,String> test2 = new HashMap<>();
        test2.put("Kendrick","Perkins");
        test2.put("Stuart","Reges");
        test2.put("Jessica","Miller");
        test2.put("Bruce","Reges");
        test2.put("Hal","Perkins");
        System.out.println(isUnique(test2)); //false
    }

    private static int countUnique(List<Integer> list) {
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(list);
        return numbers.size();
    }

    private static boolean isUnique(Map<String, String> map){
        List<String> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size()-1;i++) {
            for(int j = i+1; j<keys.size();j++){
                if(!keys.get(i).equals(keys.get(j))){
                    if(map.get(keys.get(i)).equals(map.get(keys.get(j)))){
                        return false;
                    }
                } else{
                    if(!map.get(keys.get(i)).equals(map.get(keys.get(j)))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
