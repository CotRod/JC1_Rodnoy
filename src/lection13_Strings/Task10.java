package lection13_Strings;

public class Task10 {
    public static void main(String[] args) {
        String [] arr1 = {"панда", "лама", "бегемот"};
        String [] arr2 = { "бегемот", "лама", "панда"};
        String [] arr3 = {"панда", "бегемот", "мангуст"};

        StringCompare(arr1,arr2);
        StringCompare(arr1, arr3);
    }
    private static void StringCompare(String [] a, String[] b){
        for (String s : a) {
            for (int j = 0; j < b.length; j++) {
                if (s.equals(b[j])) {
                    break;
                } else if (j == b.length - 1) {
                    System.out.println("They are different");
                    return;
                }
            }
        }
        System.out.println("They are same");
    }
}
