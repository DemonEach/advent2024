package ru.demoneach;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Day1 implements Day {

    public static final String FILE_NAME = "day1.txt";

    public int part1(String input) {
        int result = 0;

        List<Integer> leftColumn = Arrays.stream(input.split("\\n"))
                .map(i -> i.trim().split(" {3}")[0])
                .map(Integer::parseInt)
                .sorted()
                .toList();

        List<Integer> rightColumn = Arrays.stream(input.split("\\n"))
                .map(i -> i.trim().split(" {3}")[1])
                .map(Integer::parseInt)
                .sorted()
                .toList();

        for (int i = 0; i < leftColumn.size(); i++) {
            result += Math.abs(leftColumn.get(i) - rightColumn.get(i));
        }

        return result;
    }

    public int part2(String input) {
        int result = 0;

        Map<Integer, Integer> leftColumn = Arrays.stream(input.split("\\n"))
                .map(i -> i.trim().split(" {3}")[0])
                .map(Integer::parseInt)
                .collect(Collectors.toMap(x -> x, x -> 1, Integer::sum));

        Map<Integer, Integer> rightColumn = Arrays.stream(input.split("\\n"))
                .map(i -> i.trim().split(" {3}")[1])
                .map(Integer::parseInt)
                .collect(Collectors.toMap(x -> x, x -> 1, Integer::sum));

        for (Entry<Integer, Integer> elem : leftColumn.entrySet()) {
            result += elem.getKey() * elem.getValue() * (Objects.nonNull(rightColumn.get(elem.getKey()))
                    ? rightColumn.get(elem.getKey())
                    : 0);
        }

        return result;
    }
}
