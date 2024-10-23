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

        int age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        age = 65;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println();
        System.out.println();


        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short myVar01 = 15;

        if (myVar01 >= 5) {
            System.out.println("На улице +" + myVar01 + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + myVar01 + " градусов, нужно надеть шапку.");
        }

        myVar01 = -5;

        if (myVar01 >= 5) {
            System.out.println("На улице " + myVar01 + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + myVar01 + " градусов, нужно надеть шапку.");
        }
        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 55;

        if (myVar01 > 60) {
            System.out.println("Если скорость " + myVar01 + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + myVar01 + " то можно ездить спокойно.");
        }

        myVar01 = 65;

        if (myVar01 > 60) {
            System.out.println("Если скорость " + myVar01 + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + myVar01 + " то можно ездить спокойно.");
        }

        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 5;

        if (myVar01 >= 2 && myVar01 <= 6) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в детский сад.");
        } else if (myVar01 >= 7 && myVar01 <= 17) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в школу.");
        } else if (myVar01 >= 18 && myVar01 <= 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в ВУЗ.");
        } else if (myVar01 > 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно работать.");
        }

        myVar01 = 9;

        if (myVar01 > 1 && myVar01 <= 6) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в детский сад.");
        } else if (myVar01 > 6 && myVar01 <= 17) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в школу.");
        } else if (myVar01 > 17 && myVar01 <= 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в ВУЗ.");
        } else if (myVar01 > 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно работать.");
        }

        myVar01 = 16;

        if (myVar01 > 1 && myVar01 <= 6) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в детский сад.");
        } else if (myVar01 > 6 && myVar01 <= 17) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в школу.");
        } else if (myVar01 > 17 && myVar01 <= 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в ВУЗ.");
        } else if (myVar01 > 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно работать.");
        }

        myVar01 = 22;

        if (myVar01 > 1 && myVar01 <= 6) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в детский сад.");
        } else if (myVar01 > 6 && myVar01 <= 17) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в школу.");
        } else if (myVar01 > 17 && myVar01 <= 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в ВУЗ.");
        } else if (myVar01 > 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно работать.");
        }

        myVar01 = 35;

        if (myVar01 > 1 && myVar01 <= 6) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в детский сад.");
        } else if (myVar01 > 6 && myVar01 <= 17) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в школу.");
        } else if (myVar01 > 17 && myVar01 <= 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно ходить в ВУЗ.");
        } else if (myVar01 > 24) {
            System.out.println("Если возраст человека равен " + myVar01 + ", то ему нужно работать.");
        }

        System.out.println();
        System.out.println();

        // Task 5

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        myVar01 = 2;

        if (myVar01 < 5) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему нельзя кататься на аттракционе.");
        } else if (myVar01 >= 5 && myVar01 < 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (myVar01 >= 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        myVar01 = 9;

        if (myVar01 < 5) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему нельзя кататься на аттракционе.");
        } else if (myVar01 >= 5 && myVar01 < 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (myVar01 >= 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        myVar01 = 14;

        if (myVar01 < 5) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему нельзя кататься на аттракционе.");
        } else if (myVar01 >= 5 && myVar01 < 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (myVar01 >= 14) {
            System.out.println("Если возраст ребенка равен " + myVar01 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println();
        System.out.println();


        // Task 6

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int fullCapacity = 102;
        int seats = 60;

        myVar01 = 20;

        if (myVar01 < seats) {
            System.out.println("Есть свободное сидячее и стоячее места в вагоне.");
        } else if (myVar01 >= seats && myVar01 < fullCapacity) {
            System.out.println("Есть свободное стоячее место в вагоне.");
        } else if (myVar01 >= fullCapacity) {
            System.out.println("Вагон забит.");
        }

        myVar01 = 79;

        if (myVar01 < seats) {
            System.out.println("Есть свободное сидячее и стоячее места в вагоне.");
        } else if (myVar01 >= seats && myVar01 < fullCapacity) {
            System.out.println("Есть свободное стоячее место в вагоне.");
        } else if (myVar01 >= fullCapacity) {
            System.out.println("Вагон забит.");
        }

        myVar01 = 104;

        if (myVar01 < seats) {
            System.out.println("Есть свободное сидячее и стоячее места в вагоне.");
        } else if (myVar01 >= seats && myVar01 < fullCapacity) {
            System.out.println("Есть свободное стоячее место в вагоне.");
        } else if (myVar01 >= fullCapacity) {
            System.out.println("Вагон забит.");
        }

        System.out.println();
        System.out.println();


        // Task 7

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int one;
        int two;
        int three;

        one = 20;
        two = 30;
        three = 40;

        if (one > two && one > three) {
            System.out.println("\"One\" имеет самое большое значение: " + one);
        } else if (two > three) {
            System.out.println("\"Two\" имеет самое большое значение: " + two);
        } else {
            System.out.println("\"Three\" имеет самое большое значение: " + three);
        }

        one = 20;
        two = 300;
        three = 40;

        if (one > two && one > three) {
            System.out.println("\"One\" имеет самое большое значение: " + one);
        } else if (two > three) {
            System.out.println("\"Two\" имеет самое большое значение: " + two);
        } else {
            System.out.println("\"Three\" имеет самое большое значение: " + three);
        }

        one = 200;
        two = 30;
        three = 40;

        if (one > two && one > three) {
            System.out.println("\"One\" имеет самое большое значение: " + one);
        } else if (two > three) {
            System.out.println("\"Two\" имеет самое большое значение: " + two);
        } else {
            System.out.println("\"Three\" имеет самое большое значение: " + three);
        }

        System.out.println();
        System.out.println();

    }
}