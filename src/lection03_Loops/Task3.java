package lection03_Loops;

public class Task3 {
    public static void main(String[] args) {

//        int [] arr = {0,2,3,9};
//        int [] arr = {0,2,3,9,1,1,1,0,1,2,9};
//        int [] arr = {0,2,9,8,0,4,9};

        int[] arr = new int[(int) (Math.random() * 10+4)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }


        int max = 0;
        int min = 9;
        int sum = 0;

        for(int i : arr){
            if (i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
            System.out.print(i+" ");
        }

        for(int i=0;i<arr.length;i++){
            if (arr[i]==min){
                for(int j = ++i, summa = 0; j<arr.length; j++){
                    if(arr[j]== min){
                        break;
                    }else if(arr[j]==max){
                        sum += summa;
                        break;
                    } else{
                        summa+=arr[j];
                    }
                }
            }
        }

        System.out.println("Сумма = "+ sum);
    }
}
