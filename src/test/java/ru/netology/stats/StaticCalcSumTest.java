package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticCalcSumTest {

    @Test
    void calculateSum() {
        StaticCalcSum service = new StaticCalcSum();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }
}