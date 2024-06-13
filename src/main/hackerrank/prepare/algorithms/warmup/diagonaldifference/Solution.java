package main.hackerrank.prepare.algorithms.warmup.diagonaldifference;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
                leftToRightDiagonal += arr.get(i).get(i);
                rightToLeftDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/hackerhank/diagonaldifference/stdin.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/hackerhank/diagonaldifference/output.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
