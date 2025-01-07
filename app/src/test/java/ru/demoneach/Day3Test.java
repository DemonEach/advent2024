package ru.demoneach;

import org.junit.jupiter.api.Test;
import ru.demoneach.days.Day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {

    private static final String TEST_INPUT = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";

    private static final Day3 day3 = new Day3();

    @Test
    void part1Test() {
        assertEquals(161, day3.part1(TEST_INPUT));
    }

    @Test
    void part2Test() {
        String input = "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))";

        assertEquals(48, day3.part2(input));
    }
}
