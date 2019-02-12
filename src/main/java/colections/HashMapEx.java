package colections;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
    public static void main(String[] args) {


        Map<String, String> map1 = new HashMap<>();
        map1.put ("toto","tyty");
        String x = map1.put("toto","tyty");
        System.out.println(map1.get("toto"));
        map1.put(null,"lili");
        System.out.println(map1.get(null));
        map1.put(null,null);
        System.out.println(map1.get(null));

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Ionescu", 4500);
        map2.put("Popescu",5000);
        map2.put("George",6000);
        System.out.println( map2.keySet());
        System.out.println(map2.entrySet());
        System.out.println(map2.containsKey("Ionescu"));

        Map<String,Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
        map3.put("Laura",28);
        map3.put("Dana",50);
        map3.put("Anca",30);
        System.out.println(map3.entrySet());


    }
}

