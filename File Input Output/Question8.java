package Day_13_14;
class Counter{

    int count;
 public  int increment(){
        return count++;
    }

}

class Inc_count1 implements  Runnable{

    Counter c1;
    private String name;
    Inc_count1(Counter c1,String name){
        this.c1 = c1;
        this.name=name;
    }

    public void run() {
        for (int i=0;i<5;i++){
//            c1.increment();
            System.out.println( c1.increment()+ name);
        }


    }
}

public class Question8 {
    public static void main(String[] args) {
        Counter obj = new Counter();
        Inc_count1 I1 = new Inc_count1(obj , "A"), I2 = new Inc_count1(obj, "B") ;
        Thread t1 = new Thread(I1);
        Thread t2 = new Thread(I2);
        t1.start();
        t2.start();
//        System.out.println(obj.getCount());
    }
}
