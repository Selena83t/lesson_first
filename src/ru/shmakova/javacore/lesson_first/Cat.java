package ru.shmakova.javacore.lesson_first;

public class Cat {


    public String name;
    public int maxRun;
    public int maxJump;


    Cat( String name, int maxRun, int maxJump ) {
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

    public void runM() {

        System.out.println(name + " run " + maxRun + " m!");
    }
    public void jumpM() {
        System.out.println(name + " run "  + " m!");
    }
}

