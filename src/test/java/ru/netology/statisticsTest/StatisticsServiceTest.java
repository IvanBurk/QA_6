package ru.netology.statisticsTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    @Test
    void shouldServiceTestMinSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldServiceTestMaxSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldServiceSumSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldServiceAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldServiceBelowAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldServiceHigherAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.higherAverageSales(sales);

        assertEquals(expected, actual);
    }
}
