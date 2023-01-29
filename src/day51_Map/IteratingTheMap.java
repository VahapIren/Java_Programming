package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

       /* Set<String > keys=students.keySet();
        for(String key:keys){

            //System.out.println(key+" : "+students.get(key));
            students.replace(key,students.get(key)+5);
        }

        */
        System.out.println(students);



        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
    //        System.out.println(eachKey+" : "+eachValue);
            if (eachValue<90)
                System.out.println(eachKey);
            }

        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }


        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names=students.keySet();
        System.out.println("--------------------------------------------------------"  );

        Collection<Integer> scores=students.values();
        System.out.println(scores);

        List<Integer> scoress=new ArrayList<>(students.values());
        System.out.println(scoress);

        for (Integer value : students.values()) {
            System.out.println("value = " + value);
        }
        System.out.println("--------------------------------------------------------");

        int maxScoress=Integer.MIN_VALUE;
        int minScoress=Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score>maxScoress){
                maxScoress=score;
            }
            if (score<minScoress){
                minScoress=score;
            }

        }
        System.out.println("maxScoress = " + maxScoress);
        System.out.println("minScoress = " + minScoress);
        System.out.println("-------------------------------");
        System.out.println("--------------------------------------------------------");

        int max=Collections.max(students.values());
        int min=Collections.min(students.values());
        System.out.println("---------------------------------------");

        // how many students has the score of 95 or greater

        int count = 0;

        for (Integer eachScore : students.values()) {

            if (eachScore>=95)
                count++;

        }

         /*
        for (String eachKey : students.keySet()) {
            Integer eachScore=students.get(eachKey);
            if (eachScore>=95){
                count++;
            }
        }

          */

        System.out.println(count);

        System.out.println("---------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }





    }
}
