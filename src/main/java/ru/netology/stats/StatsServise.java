package ru.netology.stats;

public class StatsServise {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAver(int[] purchases) {
        int leight = purchases.length;
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum / leight;
    }

    public int searchMax(int[] purchases) {
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;

            }
        }
        int numberMax = 0;
        int CurrentNumberMax = 1;
        for (int purchase : purchases) {
            numberMax++;
            if (currentMax == purchase) {
                CurrentNumberMax = numberMax;
            }
        }
        return CurrentNumberMax;

    }

    public int searchMin(int[] purchases) {
        long currentMin = purchases[0];
        for (int purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;

            }
        }
        int numberMin = 0;
        int CurrentNumberMin = 1;
        for (int purchase : purchases) {
            numberMin++;
            if (currentMin == purchase) {
                CurrentNumberMin = numberMin;
            }
        }
        return CurrentNumberMin;

    }

    public int searchPurchaseMaxAver(int[] purchases) {
        int leight = purchases.length;
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        int AverageValue = sum / leight;

        int findPurchMax = 0;
        for (int purchase : purchases) {
            if (purchase > AverageValue) {
                findPurchMax++;
            }

        }
        return findPurchMax;

    }

    public int searchPurchaseMinAver(int[] purchases) {
        int leight = purchases.length;
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        int AverageValue = sum / leight;

        int findPurchMin = 0;
        for (int purchase : purchases) {
            if (purchase < AverageValue) {
                findPurchMin++;
            }

        }
        return findPurchMin;

    }
}
