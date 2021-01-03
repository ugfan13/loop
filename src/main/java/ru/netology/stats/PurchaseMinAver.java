package ru.netology.stats;

public class PurchaseMinAver {
    public long searchPurchaseMinAver(int[] purchases) {
        int leight = purchases.length;
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        long AverageValue = sum / leight;

        long findPurchMin = 0;
        for (long purchase : purchases) {
            if (purchase < AverageValue) {
                findPurchMin++;
            }

        }
        return findPurchMin;

    }
}
