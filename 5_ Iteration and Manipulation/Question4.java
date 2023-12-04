package Day_11_12;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Character> list = new LinkedList<>();

        List<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        char ap ;
        for( ap = 'a'; ap<='z';ap++)
        {
            list.add(ap);

//            if(ap == 'a' || ap == 'e' || ap == 'i' || ap == 'o' || ap == 'u')
//            {
//                int a = list.indexOf(ap);
//                list.set(a , '*');
//            }
        }
        System.out.println(list);

        ListIterator<Character> it = list.listIterator();

        //this will replace each vowel to '*'.
        while (it.hasNext())
        {
           char v = it.next();
           if(vowel.contains(v))
           {
               it.set('*');
           }
        }
        System.out.println(list);

    }
}
