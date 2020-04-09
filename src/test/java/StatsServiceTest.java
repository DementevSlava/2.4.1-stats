import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void allSumSales() {
        StatsService service = new StatsService();
        int allSumSales = service.allSumSales(months);
        int expected = 180;
        assertEquals(expected, allSumSales);
    }

    @Test
    void middleMonthlySales() {
        StatsService service = new StatsService();
        double middleMonthlySales = service.middleMonthlySales(months);
        int expected = 15;
        assertEquals(expected, middleMonthlySales);
    }

    @Test
    void maxSumSales() {
        StatsService service = new StatsService();
        int maxSumSales = service.maxSumSales(months);
        int expected = 8;
        assertEquals(expected, maxSumSales);
    }

    @Test
    void minSumSales() {
        StatsService service = new StatsService();
        int minSumSales = service.minSumSales(months);
        int expected = 9;
        assertEquals(expected, minSumSales);
    }

    @Test
    void numberMonthsLower() {
        StatsService service = new StatsService();
        int numberMonthsLower = service.numberMonthsLower(months);
        int expected = 5;
        assertEquals(expected, numberMonthsLower);
    }

    @Test
    void numberMonthsHigher() {
        StatsService service = new StatsService();
        int numberMonthsHigher = service.numberMonthsHigher(months);
        int expected = 5;
        assertEquals(expected, numberMonthsHigher);
    }
}