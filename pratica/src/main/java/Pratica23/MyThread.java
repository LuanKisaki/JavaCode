package Pratica23;

public class MyThread extends Thread {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
    System.out.println("Thread Principal.");
  }
}
