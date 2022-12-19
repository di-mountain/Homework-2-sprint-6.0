public class Main {
    public static void main(String[] args) {
        task1();
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
}