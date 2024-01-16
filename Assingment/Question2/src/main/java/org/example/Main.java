package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2,2, 3, 4, 5, 6, 7);

        int sum =0;
        int avg=0;

        for(int i : list){
            sum+=i;
            avg = sum/7;
        }
        System.out.println("sum of list"+sum);
        System.out.println("Average = "+avg);

        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println("Duplicate will remove = "+set);

        min(list);
        max(list);
    }

    public static void min(List<Integer> list){
        int minvalue=0;
        for(int i=0;i<list.size();i++){

            if(list.get(i) > list.get(i+1)){
                minvalue = i;
            }
        }
        System.out.println("minvalue"+minvalue);
    }
    public static void max(List<Integer> list){
        int maxvalue=0;
        for(int i : list){

            if(i < list.get(i+1-1)){
                maxvalue = i;

            }
        }
        System.out.println("maxvalue"+maxvalue);
    }

}