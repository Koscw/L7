package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Pearson> persons = new HashMap<>();
        persons.put("manager",new Pearson("Ivan",50));
        Pearson mariaPetrovna = new Pearson("Maria Petrovna",60);
        persons.put("cleaner",mariaPetrovna);
        System.out.println(persons.containsKey("manager"));
        System.out.println(persons.containsKey("director"));

        if(persons.containsKey("manager")){
            System.out.println(persons.get("manager"));
        }
        if(persons.containsKey("director")){
            System.out.println(persons.get("director"));
        }else{
            System.out.println("No director");
        }
        persons.remove("manager");
        System.out.println(persons.toString());

        for(Map.Entry<String, Pearson> pearsonEntry: persons.entrySet()){
            System.out.println("Key: "+ pearsonEntry.getKey());
            System.out.println("Value "+pearsonEntry.getValue());
        }

    }
}
