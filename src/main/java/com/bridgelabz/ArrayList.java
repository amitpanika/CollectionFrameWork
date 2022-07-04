package com.bridgelabz;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<String> List = new java.util.ArrayList<>();                // Empty Arraylist..............
        /*
        *   We are adding Element by using add(method).........
        */
        List.add("Arpit");
        List.add("Laksh");
        List.add("Ishmit");
        List.add("Rohit");
        List.add("Akash");
        System.out.println(List);
        List.add("Ravi");
        System.out.println(List);
        /*
        *    We are adding Element at the position.............(index)....(Element)...
        */
        List.add(4, "Harry");
        System.out.println(List);

        // Here We are Using (Get Method)  for getting Element from the list..........
        System.out.println(List.get(4));
        System.out.println(List);

        // Here we are using ( remove method) for removing Particular element.........
        System.out.println(List.remove(3));
        System.out.println(List);

        // Here we are using (clear method) for deleting all data ....................
        //  List.clear();
        System.out.println(List);

        // Here we are using (set Method) for inserting element at particular index....
        List.set(3,"shumit");
        System.out.println(List);

        // Here we are using ( contain method ) for knowing that element is present which element I want....
        // It will give output if element is present then (True) otherwise (False)...........
        System.out.println(List.contains("maish"));


    }
}
