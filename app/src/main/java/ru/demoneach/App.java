/*
 * This source file was generated by the Gradle 'init' task
 */
package ru.demoneach;

import lombok.extern.slf4j.Slf4j;
import ru.demoneach.days.Day1;
import ru.demoneach.days.Day2;

@Slf4j
public class App {
    public static void main(String[] args) {
        Day1 day1 = new Day1();

        log.info("Day1 Part1: {}", day1.part1(FileUtils.readFileFromResources(Day1.FILE_NAME)));
        log.info("Day1 Part2: {}", day1.part2(FileUtils.readFileFromResources(Day1.FILE_NAME)));

        Day2 day2 = new Day2();

        log.info("Day2 Part1: {}", day2.part1(FileUtils.readFileFromResources(Day2.FILE_NAME)));
        log.info("Day2 Part2: {}", day2.part2(FileUtils.readFileFromResources(Day2.FILE_NAME)));
    }
}
