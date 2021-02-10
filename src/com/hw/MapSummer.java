package com.hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSummer {
    public static void main(String[] args) {
        Map<String, LocalDate> pearson= new HashMap<>();
        pearson.put("Kate",LocalDate.of(1990,10,11));
        pearson.put("Kolya",LocalDate.of(2000,7,22));
        pearson.put("Anatoly",LocalDate.of(1987,3,2));
        pearson.put("Pete",LocalDate.of(1993,8,17));
        pearson.put("Vasya",LocalDate.of(1995,6,12));
        pearson.put("Alexa",LocalDate.of(1985,7,1));
        System.out.println("Map before distribution"+pearson.toString());
        List<String > data = new ArrayList<>(pearson.keySet());
        for(String key:data ){
            pearson.get(key);
            LocalDate val = pearson.get(key);
            int month = val.getMonthValue();
            if(month<=8 && month>=6 ){
                pearson.remove(key);

            }
        }
        System.out.println("Map after distribution"+pearson.toString());
    }
}
