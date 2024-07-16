package main.hackerrank.prepare.algorithms.warmup.minmaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Long min = 0L;
        Long max = 0L;
        arr = arr.stream().sorted().collect(toList());

        for (int i = 0; i < (arr.size() - 1); i++){
            min += arr.get(i);
        }

        arr.remove(0);

        for (int j = 0; j < arr.size(); j++){
            max += arr.get(j);
        }

        System.out.printf("%d %d\n", min, max);
    }

//    public static void miniMaxSum(List<Integer> arr) {
//        // Sort the list
//        arr.sort(Integer::compareTo);
//
//        // Calculate the minimum sum (excluding the largest element)
//        long minSum = arr.stream().limit(arr.size() - 1).mapToLong(Integer::longValue).sum();
//
//        // Calculate the maximum sum (excluding the smallest element)
//        long maxSum = arr.stream().skip(1).mapToLong(Integer::longValue).sum();
//
//        // Print the result
//        System.out.printf("%d %d\n", minSum, maxSum);
//    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        //List<Integer> arr = new ArrayList<>(Arrays.asList(256741038,623958417,467905213,714532089,938071625));
        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}




