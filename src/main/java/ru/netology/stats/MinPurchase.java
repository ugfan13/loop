package ru.netology.stats;

public class MinPurchase {
    public long searchMin(int[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;

            }
        }
        long numberMin = 0;
        long CurrentNumberMin = 1;
        for (long purchase : purchases) {
            numberMin++;
            if (currentMin == purchase) {
                CurrentNumberMin = numberMin;
            }
        }
        return CurrentNumberMin;

    }
}

