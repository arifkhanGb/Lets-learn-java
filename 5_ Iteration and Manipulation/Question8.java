package Day_11_12;

class NegetiveNumeber extends  Exception{

    String s;
    NegetiveNumeber(String s){
        this.s  = s;
    }
}

public class Question8 {
    public static void main(String[] args) throws Exception {

        int a = 4;

        try {
            if(a<0)
            throw new Exception("Negetive Number Exception");

            else
            {
                System.out.println("everything is okay");
            }
        }catch (NegetiveNumeber e)
        {
            System.out.println(e);
        }

    }
}
