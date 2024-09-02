package org.example.app.service;

import org.example.app.utils.Rounder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    @DisplayName("Test with correct operation")
    void test_Expected_Calculation_Bonus() {
        double sales = 100;
        String expected = Rounder.roundValue(10);
        assertEquals(expected,service.getRes(sales));
    }

    @Test
    @DisplayName("Test with incorrect operation")
    void test_Unexpected_Calculation_Bonus() {
        double sales = 150;
        String unexpected = Rounder.roundValue(10);
        assertNotEquals(unexpected,service.getRes(sales));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}