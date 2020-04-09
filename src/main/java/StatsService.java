public class StatsService {

    public int allSumSales(int[] months) {
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public double middleMonthlySales (int[] months) {

        return (double) allSumSales(months) / months.length;
    }

    public int maxSumSales (int[] months) {

        int max = 0;
        int maxMonth = 0;
        for (int i=0; i<months.length; i++) {
            if (months[i] >= max) {
                max = months[i];
                maxMonth = i+1;
            }
        }
        return maxMonth;
    }

    public int minSumSales (int[] months) {

        int min = maxSumSales(months);
        int minMonth = 0;
        for (int i=0; i<months.length; i++) {
            if (months[i] <= min) {
                min = months[i];
                minMonth = i+1;
            }
        }
        return minMonth;
    }

    public int numberMonthsLower (int[] months) {

        int number = 0;

        for (int month : months) {
            if (month < middleMonthlySales(months)) {
                number++;
            }
        }
        return number;
    }

    public int numberMonthsHigher (int[] months) {

        int number = 0;

        for (int month : months) {
            if (month > middleMonthlySales(months)) {
                number++;
            }
        }
        return number;
    }
}
