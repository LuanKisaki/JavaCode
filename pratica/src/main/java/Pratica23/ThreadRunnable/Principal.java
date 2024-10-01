package Pratica23.ThreadRunnable;

import Pratica23.ThreadRunnable.MyThreadRunnable;

public class Principal {
  public static void main(String[] args) {
    MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
    Thread thread = new Thread(myThreadRunnable);

    thread.start();
    System.out.println("Thread Principal.");
  }
}
