package ru.netology.stats;

public class StatsServise {
    public static void main(String[] args){
        int[] purchases = {2,17,3,1,20,5,20,6,7};

        StaticCalcSum service = new StaticCalcSum();
        long Sum = service.calculateSum(purchases);

        StaticCalcAver service1 = new StaticCalcAver();
        long Aver = service1.calculateAver(purchases);

        MaxPurchase service2 = new MaxPurchase();
        long MaxMonth = service2.searchMax(purchases);

        MinPurchase service3 = new MinPurchase();
        long MinMonth = service3.searchMin(purchases);

        PurchaseMinAver service4 = new PurchaseMinAver();
        long PurchaseUnderAverage = service4.searchPurchaseMinAver(purchases);

        PurchaseMaxAver service5 = new PurchaseMaxAver();
        long PurchaseOverAverage = service5.searchPurchaseMaxAver(purchases);

        System.out.println(Sum);
        System.out.println(Aver);
        System.out.println(MaxMonth);
        System.out.println(MinMonth);
        System.out.println(PurchaseUnderAverage);
        System.out.println(PurchaseOverAverage);

    }
}
