package day52_Map_FunctionalInterface;

import java.util.*;

public class ListOfMapPractice1 {
    public static void main(String[] args) {
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");
        System.out.println(scrumTeam1);

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");


        List<Map<String, String>> scrumTeams = new ArrayList<>();
        scrumTeams.add(scrumTeam1);
        scrumTeams.add(scrumTeam2);
        scrumTeams.addAll(Arrays.asList(scrumTeam3, scrumTeam4, scrumTeam5));
        System.out.println(scrumTeams);
        System.out.println(scrumTeams.size());

        //print the all employees names
        for (Map<String, String> scrumTeam : scrumTeams) {
            for (Map.Entry<String, String> entry : scrumTeam.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }

        //print the all names of scrum master
        for (Map<String, String> scrumTeam : scrumTeams) {
            /*for (String name : scrumTeam.keySet()) {
                if (scrumTeam.get(name).equals("SM")){
                    System.out.println(name);
                }
            }

             */

            for (Map.Entry<String, String> pair : scrumTeam.entrySet()) {
                if (pair.getValue().equals("SM")) {
                    System.out.println(pair.getKey());
                }
            }
        }
        System.out.println("--------------------------------");
        for (Map<String, String> scrumTeam : scrumTeams) {
            for (Map.Entry<String, String> pair : scrumTeam.entrySet()) {
                if (pair.getValue().equals("Developer"))
                System.out.println(pair.getKey());
            }
        }
        System.out.println("----------------------------------------------------------------");

        for (Map<String, String> scrumTeam : scrumTeams) {
            for (String each : scrumTeam.keySet()) {
                if (scrumTeam.get(each).equals("Developer")) {
                    System.out.print(each+" ");
                }
            }
            }
        }

/*
        Map<String, String>[] array = new Map[5];
        array[0] = scrumTeam1;
        array[1] = scrumTeam2;
        array[2] = scrumTeam3;
        array[3] = scrumTeam4;
        array[4] = scrumTeam5;

 */
    }



