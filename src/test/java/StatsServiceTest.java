import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    void calcAllSum () {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int allSumSales = service.allSumSales(months);


    }

}