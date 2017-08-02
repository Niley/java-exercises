package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Arraylist_num_even {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer rando, total = 0;
        for(int i=0; i<10; i++){
            rando = ThreadLocalRandom.current().nextInt(0, 21);
            System.out.println(rando);
            numbers.add(rando);
        }
        for (int num : numbers){
            if(num%2 == 0){
                total += num;
            }
        }
        System.out.println(total);
    }
}
