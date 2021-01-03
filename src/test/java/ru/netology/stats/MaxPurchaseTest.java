package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPurchaseTest {

    @Test
    void searchMax() {
        MaxPurchase service = new MaxPurchase();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 8;

        long actual = service.searchMax(purchases);

        assertEquals(expected, actual);
    }
}