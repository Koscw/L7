package com.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapRewrite {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the city and the surname");
        Map<String,String> human = new HashMap<>();
        while(true){
            String al = bufferedReader.readLine();
            String al1 = bufferedReader.readLine();
            if(al.isEmpty() || al1.isEmpty()){
                System.out.println("Enter the city");
                break;
            }else{
                human.put(al,al1);
                System.out.println("Rewrite is completed");
            }

            String city = bufferedReader.readLine();
            if (human.containsKey(city)){
                System.out.println("The city liver: "+human.get(city));
            }

        }
    }
}
