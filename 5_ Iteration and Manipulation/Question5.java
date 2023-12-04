package Day_11_12;

import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();

    for(int i = 0; i<5; i++)
    {
        list.add(i);
    }
        System.out.println(list);

    try {
        for (Integer i : list) {
            System.out.print(i + " ");
            list.remove(4);
        }
    }catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
}
