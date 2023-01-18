public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int saving = 15000;
        int goal = 2_459_000;
        int total = 0;
        int monthNumber = 0;
        while (total < goal) {
            total = total + total/100;
            total = total + saving;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + total + "руб.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int birthRate = 17;
        int deathRate = 8;
        int changeRate = birthRate - deathRate;
        int population = 12_000_000;
        for(int i = 1; i <= 10; i++){
            population += changeRate*population/1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        float total = 15000f;
        float rate = 0.07f;
        int goal = 12_000_000;
        int month = 1;
        while(total < goal){
            total += total*rate;
            System.out.printf("Месяц %d сумма накоплений равна %.2f руб.", month, total);
            System.out.println();
            month++;
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        float total = 15000f;
        float rate = 0.07f;
        int goal = 12_000_000;
        int month = 1;
        while(total < goal){
            total += total*rate;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений равна %.2f руб.", month, total);
                System.out.println();
            }
            month++;
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        float total = 15000f;
        float rate = 0.07f;
        int goal = 9*12;
        int month = 1;
        while(month <= goal){
            total += total*rate;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений равна %.2f руб.", month, total);
                System.out.println();
            }
            month++;
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 2;
        int daysInMonth = 31;
        for(int i = 1; i <= daysInMonth; i++){
            if (i % 7 == firstFriday) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.", i);
                System.out.println();
            }
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int cometPeriod = 79;
        int startYear = 2023 - 200;
        int finishYear = 2023 + 100;
        for (int year = startYear; year <= finishYear; year++){
            if (year % cometPeriod == 0){
                System.out.println(year);
            }
        }
    }

}