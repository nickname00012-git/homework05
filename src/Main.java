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

        short myVar01;
        short myVar02;
        short myVar03;

        myVar01 = 0;

        if (myVar01 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (myVar01 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        myVar01 = 1;

        if (myVar01 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (myVar01 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println();


        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 0;
        myVar02 = 2015;

        if (myVar01 == 0) {
            if (myVar02 >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (myVar01 == 1) {
            if (myVar02 >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        myVar01 = 1;
        myVar02 = 2014;

        if (myVar01 == 0) {
            if (myVar02 >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (myVar01 == 1) {
            if (myVar02 >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 2021;

        if (myVar01 <= 1584) {
            System.out.println("В это время ещё не определяли, является ли год високосным. ");
        } else if (myVar01 % 400 == 0) {
            System.out.println(myVar01 + " год является високосным. (400)");
        } else if (myVar01 % 100 == 0) {
            System.out.println(myVar01 + " год не является високосным. (100)");
        } else if (myVar01 % 4 == 0) {
            System.out.println(myVar01 + " год является високосным. ");
        } else {
            System.out.println(myVar01 + " год не является високосным. ");
        }
        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 95;

        if (myVar01 > 100) {
            System.out.println("Свыше 100 км доставка не осуществляется.");
        } else if (myVar01 <= 20) {
            myVar02 = 1;
            System.out.println("Потребуется дней: " + myVar02);
        } else if (myVar01 > 20 && myVar01 <= 60) {
            myVar02 = 2;
            System.out.println("Потребуется дней: " + myVar02);
        } else if (myVar01 > 60 && myVar01 <= 100) {
            myVar02 = 3;
            System.out.println("Потребуется дней: " + myVar02);
        }
        System.out.println();
        System.out.println();


        // Task 5

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 12;

        switch (myVar01) {
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