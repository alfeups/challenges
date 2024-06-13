package main.hackerrank.datastructures.arrays.arrayds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDS {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> b = new ArrayList<>();
        Collections.reverse(a);
        b.addAll(a);
        return b;
    }

}

