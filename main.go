package main

import (
	"fmt"
	"godvent2024/day1"
	"godvent2024/utils"
)

func main() {
	lines := utils.ReadFileLines("./day1/input.txt") // change input
	fmt.Printf("Day1 Part1: %d\n", day1.Part1(lines)) // 1873376
	fmt.Printf("Day1 Part2: %d\n", day1.Part2(lines)) // 18997088
}