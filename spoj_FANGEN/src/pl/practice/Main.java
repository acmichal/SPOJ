package pl.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FanGenerator fanGenerator = new FanGenerator();
        fanGenerator.generate();
    }
}

class FanGenerator {

    public void generate() {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        Integer n = 1;
        while (n != 0) {
            n = input.nextInt();
            list.add(n);
        }
        for (Integer item : list) {
            if (item > 0) {
                ClockwiseFan clockwiseFan = new ClockwiseFan(item);
                clockwiseFan.skeleton();
                clockwiseFan.wings();
                clockwiseFan.print();
                System.out.println();
            } else if (item < 0){
                CounterClockwiseFan counterClockwiseFan = new CounterClockwiseFan(Math.abs(item));
                counterClockwiseFan.skeleton();
                counterClockwiseFan.wings();
                counterClockwiseFan.print();
                System.out.println();
            }
        }
    }
}

class ClockwiseFan {

    private char [][] fan;
    private int order;
    ClockwiseFan(int order) {
        this.order = order;
        fan = new char[order*2][order*2];
    }

    public void skeleton() {
        for (int i = 0; i < fan.length; i++) {
            for (int j = 0; j < fan[i].length; j++) {
                fan[i][j] = '*';
            }
        }
    }

    public void wings() {
        int temp = order;
        for (int i = order; i < order * 2; i++) {
            for (int j = 0; j < temp - 1; j++) {
                fan[i][j] = '.';
            }
            temp--;
        }
        temp = order * 2;
        for (int i = order * 2 - 1; i >= order; i--) {
            for (int j = order; j < temp - 1; j++) {
                fan[i][j] = '.';
            }
            temp--;
        }
        temp = order;
        for (int i = order - 1; i >= 0; i--) {
            for (int j = order * 2 - 1; j >= temp + 1; j--) {
                fan[i][j] = '.';
            }
            temp++;
        }
        temp = 0;
        for (int i = 0; i < order; i++) {
            for (int j = order - 1; j >= temp + 1; j--) {
                fan[i][j] = '.';
            }
            temp++;
        }
    }

    public void print() {
        for (int i = 0; i < fan.length; i++) {
            for (int j = 0; j < fan[i].length; j++) {
                System.out.print(fan[i][j]);
            }
            System.out.println();
        }
    }
}

class CounterClockwiseFan {

    private char [][] fan;
    private int order;

    CounterClockwiseFan(int order) {
        this.order = order;
        fan = new char[2*order][2*order];
    }

    public void skeleton() {
        for (int i = 0; i < fan.length; i++) {
            for (int j = 0; j < fan[i].length; j++) {
                fan[i][j] = '.';
            }
        }
    }

    public void wings() {
        int temp = order;
        for (int i = order; i < order * 2; i++) {
            for (int j = 0; j < temp; j++) {
                fan[i][j] = '*';
            }
            temp--;
        }
        temp = order * 2;
        for (int i = order * 2 - 1; i >= order; i--) {
            for (int j = order; j < temp; j++) {
                fan[i][j] = '*';
            }
            temp--;
        }
        temp = order;
        for (int i = order - 1; i >= 0; i--) {
            for (int j = order * 2 - 1; j >= temp; j--) {
                fan[i][j] = '*';
            }
            temp++;
        }
        temp = 0;
        for (int i = 0; i < order; i++) {
            for (int j = order - 1; j >= temp; j--) {
                fan[i][j] = '*';
            }
            temp++;
        }
    }

    public void print() {
        for (int i = 0; i < fan.length; i++) {
            for (int j = 0; j < fan[i].length; j++) {
                System.out.print(fan[i][j]);
            }
            System.out.println();
        }
    }
}