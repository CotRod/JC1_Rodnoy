package lection03_Loops;

public class Task4 {
    public static void main(String[] args) {
        int [] threerand = new int [3];

        for (int i = 0; i < threerand.length; i++){
            threerand[i] = (int)(Math.random()*90 + 10);
        }
        for (int i = 0; i < threerand.length-1; i++){
            if(threerand[i]>threerand[i+1]){
                System.out.println("Невозрастающая последовательность");
                break;
            }
            if(i == threerand.length-2){
                System.out.println("Возрастающая последовательность");
            }
        }
        for (int i : threerand){
            System.out.print(i+ " ");
        }

    }
}
