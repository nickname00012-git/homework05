public class Main {
    public static void main(String[] args) {

        int taskN;

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 05  >>>>");
        System.out.println();

        taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();


        short clientDeviceYear;
        short clientOS = 1;


        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println();


        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        clientOS = 1;
        clientDeviceYear = 2016;

        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short year = 2021;

        if (year <= 1584) {
            System.out.println("В это время ещё не определяли, является ли год високосным. ");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным. (400)");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным. (100)");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным. ");
        } else {
            System.out.println(year + " год не является високосным. ");
        }
        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставка не осуществляется.");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        System.out.println();
        System.out.println();


        // Task 5

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short monthNumber = 12;

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + " - зимний месяц.");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + " - весенний месяц.");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + " - летний месяц.");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + " - осенний месяц.");
                break;
            default:
                System.out.println("В году нет такого месяца.");
        }

        System.out.println();
        System.out.println();

    }
}