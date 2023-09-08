import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int sumSales = service.allSales(sales);
        System.out.println(sumSales);

        int average = service.averageSalesAmount(sales);
        System.out.println(average);

        int maxMonth = service.maxMonth(sales);
        System.out.println(maxMonth);

        int minMonth = service.minMonth(sales);
        System.out.println(minMonth);

        int lessAverageSalesAmount = service.lessAverageSalesAmount(sales);
        System.out.println(lessAverageSalesAmount);

        int higherAverageSalesAmount = service.higherAverageSalesAmount(sales);
        System.out.println(higherAverageSalesAmount);
    }
}
