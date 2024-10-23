public class Main {
    public static void main(String[] args) {

        int taskN;

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 04  >>>>");
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
            case 1:
                System.out.println("Январь - зимний месяц.");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц.");
                break;
            case 3:
                System.out.println("Март - весенний месяц.");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц.");
                break;
            case 5:
                System.out.println("Май - весенний месяц.");
                break;
            case 6:
                System.out.println("Июнь - летний месяц.");
                break;
            case 7:
                System.out.println("Июль - летний месяц.");
                break;
            case 8:
                System.out.println("Август - летний месяц.");
                break;
            case 9:
                System.out.println("Сентябрь - осенний месяц.");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц.");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц.");
                break;
            case 12:
                System.out.println("Декабрь - зимний месяц.");
                break;
            default:
                System.out.println("В году нет такого месяца.");
        }

        System.out.println();
        System.out.println();

    }
}