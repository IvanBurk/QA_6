package ru.netology.statistics;

public class StatisticsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        return average;
    }

    public int belowAverageSales(long[] sales) {
        int sum = 0;
        int month = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                month += 1;
            }
        }
        return month;
    }

    public int higherAverageSales(long[] sales) {
        int sum = 0;
        int month = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (long sale : sales) {
            if (sale > average) {
                month += 1;
            }
        }
        return month;
    }
}
