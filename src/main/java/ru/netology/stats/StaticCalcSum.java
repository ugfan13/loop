package ru.netology.stats;

public class StaticCalcSum {

    public long calculateSum(int[] purchases) {

        long sum = 0;
        for (long purchase : purchases) {

            sum += purchase;
        }

        return sum;
    }
}
