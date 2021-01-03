package ru.netology.stats;

public class StaticCalcAver {
    public long calculateAver (int[] purchases){
        int leight = purchases.length;
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        long AverageValue = sum / leight;
        return AverageValue;
    }
}
