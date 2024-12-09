package day1

import (
	"strings"
	"testing"
)

func TestPart1(t *testing.T) {
	inputString := `3   4
4   3
2   5
1   3
3   9
3   3`
    lines := strings.Split(inputString, "\n")
    result := Part1(lines)
    expectedResult := 11

	if result != expectedResult {
		t.Errorf("Part1 result: %d, but wanted: %d", result, expectedResult)
	}
}

func TestPart2(t *testing.T) {
	inputString := `3   4
4   3
2   5
1   3
3   9
3   3`
    lines := strings.Split(inputString, "\n")
    result := Part2(lines)
    expectedResult := 31

	if result != expectedResult {
		t.Errorf("Part2 result: %d, but wanted: %d", result, expectedResult)
	}
}