package org.example;

public class ThreadDemo {
    public static void main(String[] args) {

        Runnable thread1 = ()->{
          // body of thread
          for(int a = 1; a<=10; a++){
              System.out.println("value =" +a);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Thread t1 =new Thread(thread1);
        t1.setName("jack");
        t1.start();

        Runnable thread2= () ->{

            try {

            for(int i = 1; i<=10; i++) {
                System.out.println(i * 2);
                Thread.sleep(2000);
            }
            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
        Thread t2 =new Thread(thread2);
        t2.setName("sparrow");
        t2.start();
        }
    }

