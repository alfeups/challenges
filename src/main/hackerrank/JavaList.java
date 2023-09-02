package main.hackerrank;

import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfElementsInL = scan.nextInt();
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int nInput = 0; nInput < numberOfElementsInL; nInput++) {
            numbersList.add(scan.nextInt());
        }

        int numberOfOperations = scan.nextInt();

        for (int nOperations = 0; nOperations < numberOfOperations; nOperations++) {
            String operation = scan.next();

            if (operation.equals("Insert")) {
                int indexOperation = scan.nextInt();
                int value = scan.nextInt();
                numbersList.add(indexOperation, value);
            } else {
                int indexOperation = scan.nextInt();
                numbersList.remove(indexOperation);
            }
        }
        scan.close();
        String res = Arrays.toString(new List[]{numbersList}).replaceAll("[\\[\\],]", "");
        System.out.println(res);
    }
}
