package ru.netology.stats;

public class StatsService {
    public int allSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return (sum);
    }

    public int averageSalesAmount(int[] sales) {
        int sumSales = allSales(sales);
        int averageSalesAmount = sumSales / sales.length;
        return averageSalesAmount;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0; // 0 - так как доходность нумеруется с 0 значения массива
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0; // 0 - так как доходность нумеруется с 0 значения массива
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessAverageSalesAmount(int[] sales) {
        int average = averageSalesAmount(sales);
        int less = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                less++;
            }
        }
        return less;
    }

    public int higherAverageSalesAmount(int[] sales) {
        int average = averageSalesAmount(sales);
        int higher = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higher++;
            }
        }
        return higher;
    }
}