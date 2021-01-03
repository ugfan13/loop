package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseMaxAverTest {

    @Test
    void searchPurchaseMaxAver() {

        PurchaseMaxAver service = new PurchaseMaxAver();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 5;

        long actual = service.searchPurchaseMaxAver(purchases);

        assertEquals(expected, actual);
    }
}