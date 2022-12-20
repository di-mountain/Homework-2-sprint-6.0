public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int sallary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += sallary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1, j = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthAmountPer1000 = 17;
        int deathAmountPer1000 = 8;
        int year = 2022;
        while (year <= 2032) {
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");
            population = population + population / 1000 * (birthAmountPer1000 - deathAmountPer1000);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sallary = 15000;
        int total = 0;
        int month = 1;
        while (total < 12_000_000) {
            total += total / 100 * 7;
            total += sallary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println("Итого: за " + (month - 1) + " месяцев накоплено " + total + " рублей");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sallary = 15000;
        int total = 0;
        int month = 1;
        while (total < 12_000_000) {
            total += total / 100 * 7;
            total += sallary;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        System.out.println("Итого: за " + (month - 1) + " месяцев накоплено " + total + " рублей");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sallary = 15000;
        int total = 0;
        int month = 1;
        for (; month <= 108; month++) {
            total += total / 100 * 7;
            total += sallary;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Итого: за " + (month - 1) + " месяцев (9 лет) накоплено " + total + " рублей");
    }
}