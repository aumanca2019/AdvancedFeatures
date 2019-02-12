package colections;

import java.util.*;

public class VariousList {
    //A java program to remove the third element from a array list
    //A java program to search an elem in a array list
    //A java program to sort a given array list
    //A java prgram to copy one array list into another
    //A java program to join two two array lists
    //A java program of swap two elements in an array list
    //A java program to increase the size of an array list
    //A java progra, to replace second element
    //A java program to iterate throgh all elements in a linked ist starting at the specified position
    //A java program to get teh first and last occurence of the specified elements in a linked list
    //A java program to iterate a linked list in reverse order

    public static void main(String[] args) {
//        Integer arr[] = new Integer[]{5, 9, 23, 78, 67, 88};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));



        List<Integer> m = new ArrayList<>();
        m.add(5);
        m.add(6);
        m.add(9);
        m.add(25);
        m.add(16);
        System.out.println(m);


        List<Integer> m1 = new ArrayList<>();
        m1.add(17);
        m1.add(22);
        m1.add(33);
        m1.add(89);
        System.out.println(m1);
        List <Integer> m3 = new ArrayList<>();
        //m3 = m1;
        //System.out.println(m3);


        m3.addAll(m);
        m3.addAll(m1);
        System.out.println(m3);

//        m.sort(Comparator.reverseOrder());
//        System.out.println(m);
//        m.sort(Comparator.naturalOrder());
//        System.out.println(m);

//        m.contains(10);
//        if(m.contains(10)) {
//            System.out.println("Exista");
//        }else {System.out.println("Nu exista");}
//        m.remove(2);
//        System.out.println(m);

        // kElementToRemove(arr, k);
        //System.out.println();


    }
}



