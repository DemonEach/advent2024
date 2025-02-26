package ru.demoneach;

import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import ru.demoneach.days.Day1;

@Slf4j
public class Day1Test {

    private static final String TEST_INPUT = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
            """;
    private static final Day1 day1 = new Day1();

    @Test
    void part1Test() {
        assertEquals(11, day1.part1(TEST_INPUT));
    }

    @Test
    void part2Test() {
        assertEquals(31, day1.part2(TEST_INPUT));
    }
}
