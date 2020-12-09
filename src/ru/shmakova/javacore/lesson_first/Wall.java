package ru.shmakova.javacore.lesson_first;

public class Wall implements Moveable {

    public int height;

    Wall( int height ) {
                this.height = height;

    }

    @Override
    public void running() {
        System.out.println("Competitor run " + height + " m!");
    }

    @Override
    public void jumping() {

    }
}
