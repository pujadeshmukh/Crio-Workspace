package Comparator;

import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {
        String[] str = {"abc","ab","ac","Abc"};
        //Sort in descending using comparator
        Arrays.sort(str, new DescendingComparison());
        System.out.println( Arrays.toString(str));

        //Using ananoymous class
        Arrays.sort(str, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        System.out.println("Using anonymous class :"+Arrays.toString(str));

        //Using Lambda expression

        Arrays.sort(str, (o1, o2) -> -1*o1.compareTo(o2));
        System.out.println("Using lambda expression : "+Arrays.toString(str));
    }
}

class DescendingComparison implements java.util.Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
}
