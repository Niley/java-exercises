package org.launchcode.java.exercises;
import java.util.ArrayList;


public class FiveLetters {
    public static void main(String[] args){
        ArrayList<String> list_o_strings = new ArrayList<>();
        list_o_strings.add("Hello");
        list_o_strings.add("Hallo");
        list_o_strings.add("Priviet");
        list_o_strings.add("Bom dia");
        list_o_strings.add("Aloha");
        list_o_strings.add("Hola");
        list_o_strings.add("Bonjour");
        list_o_strings.add("Buon giorno");
        for(String word:list_o_strings){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }

}