package pl.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int lastDigitOfResult = 0;
        int a[] = new int[10];
        int b[] = new int[10];
        int two[] = {6, 2, 4, 8};
        int three[] = {1, 3, 9, 7};
        int four[] = {6, 4};
        int seven[] = {1, 7, 9, 3};
        int eight[] = {6, 8, 4, 2};
        int nine[] = {1, 9};
        int temp;

        Scanner input = new Scanner(System.in);
        int howManyInputs = input.nextInt();

        for (int i = 0; i < howManyInputs; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }

        for (int i = 0; i < howManyInputs; i++) {
            int lastDigitOfBase = a[i] % 10;

            switch (lastDigitOfBase) {
                case 1:
                    lastDigitOfResult = 1;
                    break;
                case 2:
                    temp = b[i] % 4;
                    lastDigitOfResult = two[temp];
                    break;
                case 3:
                    temp = b[i] % 4;
                    lastDigitOfResult = three[temp];
                    break;
                case 4:
                    temp = b[i] % 2;
                    lastDigitOfResult = four[temp];
                    break;
                case 5:
                    lastDigitOfResult = 5;
                    break;
                case 6:
                    lastDigitOfResult = 6;
                    break;
                case 7:
                    temp = b[i] % 4;
                    lastDigitOfResult = seven[temp];
                    break;
                case 8:
                    temp = b[i] % 4;
                    lastDigitOfResult = eight[temp];
                    break;
                case 9:
                    temp = b[i] % 2;
                    lastDigitOfResult = nine[temp];
                    break;
                case 0:
                    lastDigitOfResult = 0;
                    break;
            }
            System.out.println(lastDigitOfResult);
        }
    }
}