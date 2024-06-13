package main.hackerrank.datastructures.arrays.array2d;

import java.util.List;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int firstRow = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int secondRow = arr.get(i + 1).get(j + 1);
                int thirdRow = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int somaAmputelha = firstRow + secondRow + thirdRow;
                if (somaAmputelha > maxSum) {
                    maxSum = somaAmputelha;
                }
            }
        }
        return maxSum;
    }

}