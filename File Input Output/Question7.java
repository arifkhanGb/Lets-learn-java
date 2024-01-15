package Day_13_14;

class First implements Runnable {

    @Override
    public void run() {
        System.out.println("first ");
    }
}
class Second implements Runnable{
    public void run(){
        System.out.println("second");
    }
}
class Third implements Runnable{
    public void run(){
        System.out.println("Third");
    }
}


public class Question7 {
    public static void main(String[] args) {
    Thread t1 = new Thread(new First());
    Thread t2 = new Thread(new Second());
    Thread t3 = new Thread(new Third());

    t1.start();
    t2.start();
    t3.start();

    }
}
