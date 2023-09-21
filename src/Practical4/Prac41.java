//package Practical4;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//
//class GoldPile {
//    int weight;
//    int value;
//
//    public GoldPile(int weight, int value) {
//        this.weight = weight;
//        this.value = value;
//    }
//}
//
//public class Prac41 {
//
//    public static double getMaxGold(List<GoldPile> piles, int capacity) {
//            Collections.sort(piles, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
//
//            double totalValue = 0.0;
//            int currentWeight = 0;
//
//            for (GoldPile pile : piles) {
//                if (currentWeight + pile.weight <= capacity) {
//                    // Take the entire pile if it fits in the bag
//                    totalValue += pile.value;
//                    currentWeight += pile.weight;
//                } else {
//                    // Take a fraction of the pile
//                    double remainingCapacity = capacity - currentWeight;
//                    totalValue += (double) pile.value * remainingCapacity / pile.weight;
//                    break; // Bag is full
//                }
//            }
//
//            return totalValue;
//        }
//
//    public static void main(String[] args) {
//        List<GoldPile> piles = new ArrayList<>();
//        piles.add(new GoldPile(10, 60));
//        piles.add(new GoldPile(20, 100));
//        piles.add(new GoldPile(30, 120));
//        int capacity = 50;
//
//        double maxGold = getMaxGold(piles, capacity);
//        System.out.println("Maximum value of gold that the burglar can take: " + maxGold);
//    }
//
//}

package Practical4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GoldPile {
    int weight;
    int value;

    public GoldPile(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Prac41 {

    public static double getMaxGold(List<GoldPile> piles, int capacity) {
        Collections.sort(piles, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double totalValue = 0.0;
        int currentWeight = 0;
        int iterations = 0;

        for (GoldPile pile : piles) {
            iterations++; // Increment the iteration counter
            if (currentWeight + pile.weight <= capacity) {
                // Take the entire pile if it fits in the bag
                totalValue += pile.value;
                currentWeight += pile.weight;
            } else {
                // Take a fraction of the pile
                double remainingCapacity = capacity - currentWeight;
                totalValue += (double) pile.value * remainingCapacity / pile.weight;
                break; // Bag is full
            }
        }

        System.out.println("Number of iterations: " + iterations);
        return totalValue;
    }

    public static void main(String[] args) {
        List<GoldPile> piles = new ArrayList<>();
        piles.add(new GoldPile(10, 60));
        piles.add(new GoldPile(20, 100));
        piles.add(new GoldPile(30, 120));
        int capacity = 50;

        double maxGold = getMaxGold(piles, capacity);
        System.out.println("Maximum value of gold that the burglar can take: " + maxGold);
    }
}

