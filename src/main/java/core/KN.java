package core;

import java.util.*;

public class KN {
    private int number;
    private int sum;
    private LinkedList<Integer> subset;
    private int[] numbers = {1, 2, 3, 4, 5, 6};

    public KN(int[] numbers, int number) {
        this.numbers = numbers;
        this.number = number;
        sum = 0;
        subset = new LinkedList<>();
    }

    public void findSubset(int startPoint, int length) {
        if (sum == number) {
            System.out.println(subset + " :: " + sum);
        } else
            for (int i = startPoint; i < length; i++) {
                sum = sum + numbers[i];
                if (sum > 10) {
                    sum = sum - numbers[i];
                    break;
                }
                subset.add(numbers[i]);
                findSubset(i + 1, length);
                sum = sum - numbers[i];
                subset.removeLast();
            }
    }

    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int number = 10;
        Arrays.sort(numbers);
        KN ki = new KN(numbers, number);
        ki.findSubset(0, numbers.length);
    }
}
