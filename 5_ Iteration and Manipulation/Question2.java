package Day_11_12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int i = 0;

        for( i = 0; i<20; i++) {
            set.add(i);
        }

        //before check
        System.out.println("all set elements");
        System.out.println(set);

        // when we need elements which is (<10)
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
        {
            int s = it.next();
            if(s>10)
            {
                continue;
            }
            System.out.print(s + " ");
        }

    }
}
