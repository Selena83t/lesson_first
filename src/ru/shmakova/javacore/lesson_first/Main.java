package ru.shmakova.javacore.lesson_first;

public class Main {

    private static Object Wall;

    public static void main( String[] args ) {

        Cat cat1 = new Cat("Murzic", 1300, 1);
        Human human1 = new Human("Vasya", 10000, 4);
        Robot robot1 = new Robot("Kozyavka", 200, 2);

        cat1.run();
        cat1.jump();
        human1.run();
        human1.jump();
        robot1.run();
        robot1.jump();

        Wall wall1 = new Wall(2);
        wall1.running();
        for (cat1.maxRun >= wall1.height) {
            System.out.println(cat1 + " run " + wall1.height + " m!");
            System.out.println(cat1 + " didn't run " + wall1.height + "m...");

        }

    }









        }


    }


