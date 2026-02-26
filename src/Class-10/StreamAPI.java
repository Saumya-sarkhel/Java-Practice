import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        // Way-1
        // 'asList()' is a method that gives you the list and its belongs to a class called 'Arrays'
        List<Integer> nums = Arrays.asList(4, 9, 5, 6, 1, 2);

        /*  Stream is an Interface.
            We got all the values of 'nums' into s1, and any operation performed in s1,
            it's not going to affect 'nums'. */
        Stream<Integer> s1 = nums.stream();


        // The benefites of using Stream is It provides a lot of methods to work with.
        // This filter() return a stream, so s1 is used in the method and got new stream s2.
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0); // filters even numbers


        // Here s2 is used and got new Stream s3 to work, map() also return a stream
        Stream<Integer> s3 = s2.map(n -> n*2); // Double the even numbers from s2(4*2, 6*2, 2*2)


        // The one thing about Stream is, Once you use it, you can't reuse it.
        s3.forEach(n -> System.out.println(n));


        // s3.forEach(n -> System.out.println(n)); // will give a Runtime error, can't use twice or more.



        // Way-2
        // At one time apply every method

        int result = nums.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e); // reduce() doesnot return stream, it returns type
        System.out.println(result);

    }
}
