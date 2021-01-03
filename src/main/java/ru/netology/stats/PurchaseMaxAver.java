package ru.netology.stats;

public class PurchaseMaxAver {
    public long searchPurchaseMaxAver(int[] purchases) {
        int leight = purchases.length;
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        long AverageValue = sum / leight;

        long findPurchMax = 0;
        for (long purchase : purchases) {
            if (purchase > AverageValue) {
                findPurchMax++;
            }

        }
        return findPurchMax;

    }
}
