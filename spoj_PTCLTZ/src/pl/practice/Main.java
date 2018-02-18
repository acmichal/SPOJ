package pl.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> Entries = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int howManyEntries = input.nextInt();

        for (int i = 0; i < howManyEntries; i++) {
            Entries.add(input.nextInt());
        }

        for (Integer entry : Entries) {
            int n = 0;
            while (entry != 1) {
                n++;
                if (entry % 2 == 0) {
                    entry = entry / 2;
                } else {
                    entry = 3 * entry + 1;
                }
            }
            System.out.println(n);
        }
    }
}
