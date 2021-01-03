package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseMinAverTest {

    @Test
    void searchPurchaseMinAver() {
        PurchaseMinAver service = new PurchaseMinAver();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 5;

        long actual = service.searchPurchaseMinAver(purchases);

        assertEquals(expected, actual);
    }
}