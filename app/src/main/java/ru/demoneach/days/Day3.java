package ru.demoneach.days;

import lombok.extern.slf4j.Slf4j;
import ru.demoneach.Day;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class Day3 implements Day {

    public static final String FILE_NAME = "day3.txt";
    private static Pattern p = Pattern.compile("(?<=mul\\()\\d{1,3},\\d{1,3}(?=\\))");

    public int part1(String input) {
        int result = 0;
        Matcher m = p.matcher(input);

        while( m.find() ) {
            result += makeMulCalculation(m.group());
        }

        return result;
    }

    public int part2(String input) {
        int result = 0;
        boolean isCalculationEnabled = true;

        Pattern p2 = Pattern.compile("(do\\(\\)|mul\\(\\d{1,3},\\d{1,3}\\)|don't\\(\\))");
        Matcher m = p2.matcher(input);

        Pattern integerPattern = Pattern.compile("\\d{1,3},\\d{1,3}");

        while( m.find() ) {
            String match = m.group();
            switch (match) {
                case "do()":
                    isCalculationEnabled = true;
                    break;
                case "don't()":
                    isCalculationEnabled = false;
                    break;
                default:
                    break;
            }

            Matcher integerMatcher = p.matcher(match);

            if (isCalculationEnabled && integerMatcher.find()) {

                result += makeMulCalculation(integerMatcher.group());
            }
        }

        return result;
    }

    private int makeMulCalculation(String input) {
        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .reduce(1, (x, y) -> x * y);
    }
}
