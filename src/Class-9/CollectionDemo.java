/*
    Collection API ->  The concept --> Map(key-value pair)
    Collection     ->  Interface  --> List(ArrayList, LinkedList), Queue(DeQueue), Set(HashSet, TreeSet)
    Collections    ->  Class

*/

import java.util.*; // Arraylist, Collection, HashSet, Set, Map etc..
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {

        /*
            Collection -> ArrayList
            Collection -> does'nt support index values but can have duplicate values
        */
        Collection<Integer> nums = new ArrayList<Integer>();

        System.out.println("Collection:-");
        nums.add(7);
        nums.add(9);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(3);

        System.out.println(nums); // Directly prints the nums as array
        // Output: [7, 9, 2, 5, 3, 3]

        // =============================================================================//

        /*
            List -> ArrayList
            List -> index values, and duplicate values
         */
        List<Integer> num2 = new ArrayList<Integer>();

        System.out.println("\nList:-");
        num2.add(7);
        num2.add(9);
        num2.add(2);
        num2.add(5);
        num2.add(3);

        System.out.println(num2); // Output: [7, 9, 2, 5, 3]

        System.out.println(num2.get(3)); // index value of 3 is 5

        System.out.println(num2.indexOf(9)); // find the index of value 9 from set = 1

        // =============================================================================//

        /*
            Set -> HashSet
            Set -> No duplicate values, and don't have index values, no ordering
         */
        Set<Integer> num3 = new HashSet<Integer>();
        // TreeSet<Integer>() will sort the data by itself when printing.

        System.out.println("\nSet:-");
        num3.add(7);
        num3.add(9);
        num3.add(2);
        num3.add(5);
        num3.add(3);

        System.out.println(num3); //Output: [2, 3, 5, 7, 9]

        // =============================================================================//

        /*
            'TreeSet' implements 'Set' and 'Set' extends 'Collection'.
            On top of Collection there's an interface classed 'Iterable'.
        */
        Collection<Integer> num4 = new TreeSet<Integer>();

        System.out.println("\nTreeSet & Iterator:-");
        num4.add(7);
        num4.add(9);
        num4.add(2);
        num4.add(5);
        num4.add(3);

        // From the 'iterator()' we get all the values
        Iterator<Integer> values = num4.iterator();

        // hasNext() tell do we have next elements
        // TreeSet<Integer>() prints in sorted order
        while(values.hasNext()){
            System.out.println(values.next());
        }

        // =============================================================================//

        /*
            Map -> {Key-Value} Pair. Keys are unique, values aren't.
            {Set-List} combination -> Keys are Set and values are List here.
        */
        Map<String, Integer> Student = new HashMap<>();

        System.out.println("\nMap:-");
        Student.put("David", 56);
        Student.put("John", 89);
        Student.put("Danial", 77);
        Student.put("Rohan", 98);
        Student.put("Danial", 88); // Danial value update 77 -> 88

        // prints entire Map
        System.out.println(Student);

        // Prints the marks of John
        System.out.println("Marks: " + Student.get("John"));

        System.out.println(Student.keySet());
        // Output: [Danial, David, John, Rohan]

        for( String key : Student.keySet()){
            System.out.println(key + " : " + Student.get(key));
        }
        /*  Output:
                Danial : 88
                David : 56
                John : 89
                Rohan : 98
        */


        /*
            Map<String, Integer> Student1 = new Hashtable<>();

            'HashTable<>()' also do same work as 'HashSet<>()'
            Only difference is that HashTable is Synchronized. If multiple threads are working,
            it's better to use HashTable.
        */

    }
}
