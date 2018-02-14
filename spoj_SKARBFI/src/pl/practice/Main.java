package pl.practice;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        int a[] = new int[100];
        int b[] = new int[100];
        int howManyPairs[] = new int[100];
        int horizontal = 0;
        int vertical = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        int howManyDatasets = input.nextInt();

        for (int i = 0; i < howManyDatasets; i++) {
            howManyPairs[i] = input.nextInt();
            for (int j = 0; j < howManyPairs[i]; j++) {
                a[counter] = input.nextInt();
                b[counter] = input.nextInt();
                counter ++;
            }
        }

        counter = 0;

        for (int i = 0; i < howManyDatasets; i++) {
            for (int j = 0; j < howManyPairs[i]; j++) {
                switch (a[counter]) {
                    case 0:
                        vertical = vertical + b[counter];
                        break;
                    case 1:
                        vertical = vertical - b[counter];
                        break;
                    case 2:
                        horizontal = horizontal - b[counter];
                        break;
                    case 3:
                        horizontal = horizontal + b[counter];
                        break;
                }
                counter++;
            }

            if (vertical < 0) {
                System.out.println("1 " + abs(vertical));
            } else if (vertical > 0) {
                System.out.println("0 " + abs(vertical));
            }

            if (horizontal < 0) {
                System.out.println("2 " + abs(horizontal));
            } else if (horizontal > 0) {
                System.out.println("3 " + abs(horizontal));
            }

            if (vertical == 0 && horizontal == 0) {
                System.out.println("studnia");
            }
            vertical = 0;
            horizontal = 0;
        }
    }
}