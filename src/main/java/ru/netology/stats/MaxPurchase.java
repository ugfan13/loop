package ru.netology.stats;

public class MaxPurchase {

    public long searchMax(int[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;

            }
        }
        long numberMax = 0;
        long CurrentNumberMax = 1;
        for (long purchase : purchases) {
            numberMax++;
            if (currentMax == purchase) {
                CurrentNumberMax = numberMax;
            }
        }
        return CurrentNumberMax;

    }
}
