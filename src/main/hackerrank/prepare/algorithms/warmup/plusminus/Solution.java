package main.hackerrank.prepare.algorithms.warmup.plusminus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float positive = 0, negative = 0, zero = 0;

//        for (Integer arrElement : arr) {
//            if (arrElement > 0) {
//                positive += 1;
//            } else if (arrElement < 0) {
//                negative += 1;
//            } else {
//                zero += 1;
//            }
//        }
        positive = arr.stream().filter(p -> p > 0).count();
        negative = arr.stream().filter(n -> n < 0).count();
        zero = arr.stream().filter(z -> z == 0).count();


        System.out.printf("%.6f\n", positive / arr.size());
        System.out.printf("%.6f\n", negative / arr.size());
        System.out.printf("%.6f\n", zero     / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/hackerhank/warmup/plusminus/stdin.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
