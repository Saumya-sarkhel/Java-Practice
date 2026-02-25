import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {

        /* Comparator is a Interface using which you can specify your own logic for sortig */
        Comparator<Integer> com = new Comparator<Integer>()
        {
            /* compare() is a inbild method to compare */
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(71);
        nums.add(27);
        nums.add(92);
        nums.add(35);

        /* Collections -> Class; Sort() is one of the method */
        Collections.sort(nums);
        System.out.println(nums);
        // Output: [27, 35, 43, 71, 92]


        /* Sort only based on last digit, we explecitely do this in compare method using annonymas class */
        Collections.sort(nums, com);
        System.out.println(nums);
        // Output [71, 92, 43, 35, 27]

    }
}
