package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 145000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 85000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?

        String name1 = "";
        String name2 = "";
        int maxSalary = Collections.max(map.values());
        int minSalary = Collections.min(map.values());
/*
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name1 = eachKey;

            }
            if (eachValue < minSalary) {
                minSalary = eachValue;
                name2 = eachKey;
            }

        }

 */
        for (Integer eachValue : map.values()) {
            if (eachValue>maxSalary)
                maxSalary = eachValue;
            if (eachValue<minSalary)
                minSalary = eachValue;
        }
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()==maxSalary)
                System.out.println(pair.getKey());
            if (pair.getValue()==minSalary)
                System.out.println(pair.getKey());
        }

        System.out.println("----------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer value : map.values()) {
            if (value>=120000&&value<150000){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("----------------------------------------------");

        //   1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<118000)
                System.out.println(entry.getKey());
        }
        System.out.println(map);
        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K

        System.out.println("-------------------------------------------");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<120000) {
                entry.setValue(entry.getValue() + 10000);
            }
        }
        System.out.println(map);
        }





    }

