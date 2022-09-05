package Array;

import java.util.*;

public class Trial {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        if(list.contains(1)){
            int loc = list.indexOf(1);
            list.add(loc);
        }
    }
}

