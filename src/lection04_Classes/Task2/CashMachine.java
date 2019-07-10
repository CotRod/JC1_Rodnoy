package lection04_Classes.Task2;

import java.util.Scanner;

class CashMachine {
    private int twenty, fifty, hundred, sum;

    CashMachine(int t, int f, int h) {
        twenty = t;
        fifty = f;
        hundred = h;
        sum = 100 * hundred + 50 * fifty + 20 * twenty;
    }

    void start() {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to do?");
            System.out.println("1. Put money");
            System.out.println("2. Get money");
            System.out.println("3. Nothing");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Insert a dollar bill");
                if (this.putMoney(sc.nextInt())) {
                    System.out.println("The operation has been successful");
                } else {
                    System.out.println("Error! An unspecified  dollar bill.");
                }
            } else if (choice == 2) {
                System.out.println("How much money do you need?");
                boolean sccsfl = this.getMoney(sc.nextInt());
                if (sccsfl) {
                    System.out.println("The operation has been successful");
                } else {
                    System.out.println("Sorry! We don't have so much money");
                }
            } else {
                System.out.println("Have a nice day :)");
                break;
            }
        }
    }

    private boolean putMoney(int i) {
        switch (i) {
            case 20:
                twenty++;
                return true;
            case 50:
                fifty++;
                return true;
            case 100:
                hundred++;
                return true;
            default:
                return false;
        }
    }

    private boolean getMoney(int i) {
        if (i > sum) {
            return false;
        }
        int t, f=0, h;
        // How many hundred dollar bills do we need
        h = i / 100;
        if (i % 100 != 0 && i % 100 < 50 && h != 0) {
            h -= 1;
        }
        if (hundred <= h) {
            h = hundred;
            hundred = 0;
        } else {
            hundred -= h;
        }
        i -= h * 100;

        // How many fifty dollar bills do we need
        if(fifty!=0) {
            f = i / 50;
            if (i % 50 != 0 && f != 0) {
                f -= 1;
            }
            if (fifty < f) {
                f = fifty;
                fifty = 0;
            } else {
                fifty -= f;
            }
            i -= f * 50;
            if (i % 20 != 0) {
                fifty++;
                f--;
                i+=50;
            }
        }

        // How many twenty dollar bills do we need
        t = i / 20;
        if (twenty <= t) {
            t = twenty;
            twenty = 0;
        } else {
            twenty -= t;
        }
        i -= t * 20;

        if (i > 0) {
            hundred += h;
            fifty += f;
            twenty += t;
            return false;
        } else {
            System.out.println("You've received " + (t * 20 + f * 50 + h * 100) + " dollars");
            System.out.println(h + " - hundred-dollar bills; " + f + " - fifty-dollar bills; " + t + " - twenty-dollar bills");
            return true;
        }
    }
}
