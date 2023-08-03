package Practical3;


import java.util.*;

class GoldPile implements Comparable<GoldPile> {
    int value;
    int weight;
    double valuePerWeight;

    public GoldPile(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.valuePerWeight = (double) value / weight;
    }

    @Override
    public int compareTo(GoldPile other) {
        return Double.compare(other.valuePerWeight, this.valuePerWeight);
    }
}

public class Kruskalalgowitharray {
    public static double getMaxGoldValue(int W, int[] values, int[] weights) {
        List<GoldPile> goldPiles = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            goldPiles.add(new GoldPile(values[i], weights[i]));
        }
        Collections.sort(goldPiles);

        double totalValue = 0;
        int currentWeight = 0;

        for (GoldPile pile : goldPiles) {
            if (currentWeight + pile.weight <= W) {
                totalValue += pile.value;
                currentWeight += pile.weight;
            } else {
                double fraction = (double) (W - currentWeight) / pile.weight;
                totalValue += pile.value * fraction;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {10,20,30};
        int[] weights = {40,50,60};
        int bagCapacity = 70;

        double maxGoldValue = getMaxGoldValue(bagCapacity, values, weights);
        System.out.println("Maximum value of gold dust: " + maxGoldValue);
    }
}

