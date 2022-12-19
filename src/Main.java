public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

}