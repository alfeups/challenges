package main.hackerrank.prepare.algorithms.warmup.birthdaycakecandles;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Optional<Integer> tallestCandle = candles.stream().max(Integer::compareTo);
        int numberOfCandles = 0;

        for (Integer candle : candles) {
            if (Objects.equals(candle, tallestCandle.get())){
                numberOfCandles++;
            }
        }
        System.out.println(numberOfCandles);
        return numberOfCandles;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/hackerrank/prepare/algorithms/warmup/birthdaycakecandles/stdin.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/hackerrank/prepare/algorithms/warmup/birthdaycakecandles/output.txt"));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
