public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int depositAmount = 15000;
        int savings = 0;
        int monthNumber;
        while (savings < 2459000) {
            savings = savings + savings / 100;
            savings = savings + depositAmount;
            monthNumber = savings / depositAmount;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + savings + " рублей.");
        }
        // Задача 2
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int u = 10; u > 0; u = u - 1) {
            System.out.print(u + " ");
        }
        // Задача 3
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = population / 1000 * 17;
        int mortality = population / 1000 * 8;
        for (int year = 2024; year <= 2033; year = year + 1) {
            population = population + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задача 4
        System.out.println("Задача 4");
        int contribution = 15000;
        int target = 0;
        int month = 1;
        for (; target < 12000000; month = month + 1) {
            target = target + target / 100 * 7;
            target = target + contribution;
            System.out.println("Месяц " + month + " колличество накоплений " + target);
        }
        System.out.println(month - 1 + " месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей");
        //Задача 5
        System.out.println("Задача 5");
        int contribution1 = 15000;
        int target1 = 0;
        int month1 = 1;
        for (; target1 < 12000000; month1 = month1 + 1) {
            target1 = target1 + target1 / 100 * 7;
            target1 = target1 + contribution1;
            if (month1 % 6 == 0)
                System.out.println("Месяц " + month1 + " колличество накоплений " + target1);
        }
        //Задача 6
        System.out.println("Задача 6");
        int sum = 15000;
        int year = 9;
        int monthsInYear = 12;
        int finalMonth = monthsInYear * year;
        for (int months = 1; months <= finalMonth; months++) {
            sum = sum + (int) (sum * 0.07);
            if (months % 6 == 0)
                System.out.println("Месяц " + months + " сумма накоплений " + sum);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int firstFriday = 5; firstFriday < 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчёт.");
        }
        //Задача 8
        System.out.println("Задача 8");
        int juniorYear = 1823;
        int finalYear = 2123;
        int j = 0;
        for (; j < finalYear; j = j + 79) {
            if (j > juniorYear)
                System.out.println(j);
        }
    }
}