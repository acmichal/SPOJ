package pl.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List <Integer> howManyKids = new ArrayList<>();
        List <Integer> howManyCandies = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int howManyDatasets = input.nextInt();

        for (int i = 0; i < howManyDatasets; i++) {
            howManyKids.add(input.nextInt());
            howManyCandies.add(input.nextInt());
        }

        for (int i = 0; i < howManyDatasets; i++) {
            if (howManyKids.get(i) - 1 == howManyCandies.get(i)) {
                System.out.println("NIE");
            }
            else if (howManyKids.get(i) - 1 > howManyCandies.get(i)) {
                System.out.println("TAK");
            }
            else if (howManyKids.get(i) - 1 < howManyCandies.get(i) && howManyKids.get(i) > 1) {
                if (howManyCandies.get(i) % (howManyKids.get(i) - 1) > 0) {
                    System.out.println("TAK");
                } else {
                    System.out.println("NIE");
                }
            }
            else {
                System.out.println("TAK");
            }
        }
    }
}
