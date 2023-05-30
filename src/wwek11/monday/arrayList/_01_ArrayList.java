package wwek11.monday.arrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        //array : It is used for data in cases where the number of dimensions is certain.
        //Its size cannot be changed later.
        int[] dizi=new int[5];

        //ArrayList : Its size can change dynamically, that is, it can increase as you add elements,
        // Array that can decrease as you delete.
        ArrayList<Integer> integerList = new ArrayList<>(); // create an arraylist object
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        // String ArrayList
        ArrayList<String> nameList=new ArrayList<>();

        //adding element
        nameList.add("ozgur");
        nameList.add("Ahmet");
        nameList.add("Ayşe");
        nameList.add("Kaya");
        nameList.add("Kaya");
        System.out.println("nameList = " + nameList);

        // Adding an element to a certain index
        nameList.add(1, "Eray");
        System.out.println("nameList = " + nameList);

        //getting an element from a certain index
        String element=nameList.get(2);
        System.out.println("element = " + element);

        // Updating an element at a certain index
        nameList.set(1,"Cankut");
        System.out.println("nameList = " + nameList);
//
//        // size of list
        int size= nameList.size();
        System.out.println("size = " + size);
//
        //is empty
        boolean isEmpty = nameList.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
//
//        //removing
        nameList.remove("Kaya");
        nameList.remove("Kaya");
        System.out.println("nameList = " + nameList);
//
        nameList.remove(1);  // remove according to index
        System.out.println("nameList = " + nameList);
//
//        // finding index of element
        int indexOfKaya= nameList.indexOf("Kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);
//
//        //remove all elements of list
       // nameList.clear();
        System.out.println("nameList = " + nameList);
        isEmpty = nameList.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
//
//        // printing list
        for(int i=0; i< nameList.size();i++)
            System.out.println("nameList = " + nameList.get(i));
    }
}
