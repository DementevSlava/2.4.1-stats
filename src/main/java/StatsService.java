public class StatsService {

    public int allSumSales(int[] months) {
        int sum = 0;
        for (int i=0; i<months.length; i++) {
            sum += months[i];
        }
        return sum;
    }

    public double middleMonthlySales (int[] months) {

        double sum = (double) allSumSales(months) / months.length;
        return sum;
    }

    public double maxSumSales (int[] months) {


    }
}
