package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticCalcAverTest {

    @Test
    void calculateAver() {
        StaticCalcAver service = new StaticCalcAver();

        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 15;

        long actual = service.calculateAver(purchases);

        assertEquals(expected, actual);
    }
}