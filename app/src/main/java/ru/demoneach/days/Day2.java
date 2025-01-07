package ru.demoneach.days;


import ru.demoneach.Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day2 implements Day {

    public static final String FILE_NAME = "day2.txt";

    public int part1(String input) {
        int result = 0;

        String[] lines = input.split("\\n");

        for (String line : lines) {
            List<Integer> listToCheck = Arrays.stream(line.split(" "))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toList();

            if (isSafe(listToCheck)) {
                result++;
            }
        }

        return result;
    }

    private boolean isSafe(List<Integer> lineToCheck) {

        boolean isDecreesing = true;
        boolean isIncreasing = true;
        boolean isInRange = true;

        for (int i = 0; i < lineToCheck.size() - 1; i++) {
            if (lineToCheck.get(i) > lineToCheck.get(i + 1)) {
                isIncreasing = false;
            }

            if (lineToCheck.get(i) < lineToCheck.get(i + 1)) {
                isDecreesing = false;
            }

            int itemsDiff = Math.abs(lineToCheck.get(i) - lineToCheck.get(i + 1));

            if (itemsDiff < 1 || itemsDiff > 3) {
                isInRange = false;
            }
        }

        return isDecreesing && isInRange || isIncreasing && isInRange;
    }

    public int part2(String input) {
        int result = 0;

        String[] lines = input.split("\\n");

        for (String line : lines) {
            List<Integer> listToCheck = Arrays.stream(line.split(" "))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toList();

            if (isSafe(listToCheck)) {
                result++;
                continue;
            }

            for (int i = 0; i < listToCheck.size(); i++) {
                List<Integer> tmpList = new ArrayList<>(listToCheck);
                tmpList.remove(i);

                if (isSafe(tmpList)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}
