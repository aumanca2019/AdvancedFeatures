package colections;

import java.util.*;

public class MyNiceLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(5);
        linkedList1.add(9);
        linkedList1.add(17);
        linkedList1.add(8);
        linkedList1.add(22);


        Iterator<Integer> iterator = linkedList1.listIterator(2);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Iterator<Integer> iterator1 = ((LinkedList<Integer>) linkedList1).descendingIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }


        System.out.println();
        System.out.println(((LinkedList<Integer>) linkedList1).getFirst());
        System.out.println(((LinkedList<Integer>) linkedList1).getLast());


//        ((LinkedList<Integer>) linkedList1).addFirst(5);
//        linkedList1.indexOf(5);
//        System.out.println(linkedList1);


        Set<String> mySet = new HashSet<>();

        //Write a java program to convert a hash set to a list/arrayList
        //write a java program to compare two sets and retain element which are same on both sets.

        mySet.add("Anca");
        mySet.add("Adina");
        mySet.add("Laura");
        mySet.add("Dana");
        mySet.add("Dana");
        System.out.println(mySet);

        List<String> myArray = new ArrayList<>(mySet);
        myArray.add("Dana");
        System.out.println(myArray);
    }
}