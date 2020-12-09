package ru.shmakova.javacore.lesson_first;

public class Human {


   public String name;
   public int maxRun;
   public int maxJump;

    Human( String name, int maxRun, int maxJump ) {
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




  //@Override
  //public void runM() {
  //    System.out.println("Human can run " + maxRun + " m ");
  //}

  //@Override
  //public void jumpM() {
  //    System.out.println("Human can run " + maxJump + " m ");
  //}

    //public void runM() {
   //    System.out.println("I can " + maxRun + " m run");
   //}
   //public void jumpM() {
   //    System.out.println("I can " + maxJump + " m jump");
   //}


