package lection18_Thread;
//Создать поток, который будет в цикле итерироваться от 1до 10 000 000 и суммировать каждый четный элемент кратный 3.
//На каждой итерации,кратной 1 000 000,поток должен заснуть на 10мс.
//Вместе с суммирующим потоком запустить поток демон,который каждую пятую миллисекунду выводит в консоль
// текущее значение просуммированных элементов

public class Task1 {
    public static long sum = 0;
    public static void main(String[] args){
        Thread t1 = new Thread(()-> {
            for (int i = 1; i < 10000000; i++) {
                if (i % 3 == 0 && i % 2 == 0) {
                    sum += i;
                }
                if (i % 1000000 == 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread daemon = new Thread(()->{
            while (true) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println(sum);
            }
        });
        t1.start();
        daemon.setDaemon(true);
        daemon.start();
    }
}
