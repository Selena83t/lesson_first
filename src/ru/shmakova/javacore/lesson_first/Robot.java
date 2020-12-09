package ru.shmakova.javacore.lesson_first;

public class Robot{


    public String name;
    public int maxRun;
    public int maxJump;

    Robot( String name, int maxRun, int maxJump ) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public void run() {

        System.out.println(name + " can run " + maxRun + " m");
    }
    public void jump() {
                System.out.println(name + " can jump " + maxJump + " m");
    }


}
