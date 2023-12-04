package Day_11_12;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<5; i++)
        {
            list.add(i);
            System.out.print(i + " ");
        }

        System.out.println();

        //updated value of third element
        list.set(2,10);

        System.out.println("update the value of 3rd element");
        System.out.println(list);

        //remove the 2nd elements
        System.out.println("remove 2nd element");
        list.remove(1);
        System.out.println(list);
    }
}
