package day2

import (
	"strings"
	"testing"
)

func TestPart1(t *testing.T) {
	inputString := `7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9`
	lines := strings.Split(inputString, "\n")
	result := Part1(lines)
	expectedResult := 2

	if result != expectedResult {
		t.Errorf("Part1 result: %d, but wanted: %d", result, expectedResult)
	}
}

func TestPart2(t *testing.T) {
	inputString := `7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9`
	lines := strings.Split(inputString, "\n")
	result := Part2(lines)
	expectedResult := 4

	if result != expectedResult {
		t.Errorf("Part2 result: %d, but wanted: %d", result, expectedResult)
	}
}
