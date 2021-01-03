package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPurchaseTest {

    @Test
    void searchMin() {
        MinPurchase service = new MinPurchase();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 9;

        long actual = service.searchMin(purchases);

        assertEquals(expected, actual);
    }
}