package lection03_Loops;

import java.util.Arrays;

public class Task7and8 {
    public static void main(String[] args) {
        String [] cards = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] suits = {"Hearts","Spades","Clubs","Diamonds"};
        System.out.println(cards[(int)(Math.random()*13)]+ " of "+ suits[(int)(Math.random()*4)]);
// Создаем колоду
        String[] deck = new String[52];
        int count=0;
        for(int s = 0; s<4; s++){
            for(int c = 0; c<13;c++){
                deck[count]= cards[c] + " of " + suits[s];
                count++;
            }
        }
// Перемешиваем
        for(int i = 0; i<25;i++){
            int pos1 = (int)(Math.random()*52);
            int pos2 = (int)(Math.random()*52);
            String p = deck[pos1];
            deck[pos1]= deck[pos2];
            deck[pos2] = p;
        }

        System.out.println(Arrays.toString(deck));
    }
}
