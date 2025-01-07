package ru.demoneach;

import org.junit.jupiter.api.Test;
import ru.demoneach.days.Day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {

    private static final String TEST_INPUT = """
7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9
            """;
    private static final Day2 day2 = new Day2();

    @Test
    void part1Test() {
        assertEquals(2, day2.part1(TEST_INPUT));
    }

    @Test
    void part2Test() {
        assertEquals(4, day2.part2(TEST_INPUT));
    }
}
