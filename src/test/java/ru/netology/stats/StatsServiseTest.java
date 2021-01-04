package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiseTest {

    @Test
    void calculateSum() {
        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }


    @Test
    void calculateAver() {
        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAver(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void searchMax() {
        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.searchMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void searchMin() {
        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.searchMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void searchPurchaseMaxAver() {

        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.searchPurchaseMaxAver(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void searchPurchaseMinAver() {
        StatsServise service = new StatsServise();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.searchPurchaseMinAver(purchases);

        assertEquals(expected, actual);
    }
}