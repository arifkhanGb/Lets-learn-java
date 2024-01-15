package Day_13_14;

class A extends Thread
{
    public void run() {
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(200);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            System.out.println("Thread A= "+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(500);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            System.out.println("Thread B= "+i);
        }
    }
}
public class Question6 {

    public static void main(String[] args) {

//        Thread t1=new Thread(new A());
//        Thread t2=new Thread(new B());
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();


    }

}
