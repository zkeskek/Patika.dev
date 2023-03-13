package HashMapa;


import java.util.*;

public class HashMapa1 {
   
    public static void main(String[] args) {
        HashMap<String, String> country=new HashMap<>();
        country.put("TR", "Türkiye");
        country.put("EN","England");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");
        country.put("RU", "Rusya");
        
        System.out.println(country.get("TR"));
        System.out.println(country.size());
        country.remove("EN");
        System.out.println(country.get("EN"));
        System.out.println(country.size());
        System.out.println("---------------");

        for (String key : country.keySet()) {
            System.out.println(key);
            System.out.println(country.get(key));

        }
        System.out.println("---------------");
        country.replace("GR",  "Alamanya");

        for (String name : country.values()) {
            System.out.println(name);
        }

        
    }
}
