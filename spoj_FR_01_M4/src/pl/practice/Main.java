package pl.practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> JasFlowers = new ArrayList<>();
        List<Integer> StasFlowers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Integer howManyJasFlowers = input.nextInt();

        for (int i = 0; i < howManyJasFlowers; i++) {
            JasFlowers.add(input.nextInt());
        }

        Integer howManyStasFlowers = input.nextInt();

        for (int i = 0; i < howManyStasFlowers; i++) {
            StasFlowers.add(input.nextInt());
        }

        JasFlowers.sort(Comparator.naturalOrder());

        int smallestDiff = 1000000001;
        for (Integer stasFlower : StasFlowers) {
            int index = Collections.binarySearch(JasFlowers, stasFlower);
            if (index > 0) {
                smallestDiff = 0;
            } else if (index < 0) {
                int diffWithNumberBefore = 1000000001;
                int diffWithNumberAfter = 1000000001;
                if (index != -1) {
                    diffWithNumberBefore = stasFlower - JasFlowers.get(Math.abs(index) - 2);
                }
                if (Math.abs(index) <= JasFlowers.size()) {
                    diffWithNumberAfter = Math.abs(stasFlower - JasFlowers.get(Math.abs(index) - 1));
                }
                if (diffWithNumberAfter <= diffWithNumberBefore && diffWithNumberAfter <= smallestDiff) {
                    smallestDiff = diffWithNumberAfter;
                } else if(diffWithNumberBefore <= diffWithNumberAfter && diffWithNumberBefore <= smallestDiff) {
                    smallestDiff = diffWithNumberBefore;
                }
            }
        }
        System.out.println(smallestDiff);
    }
}


