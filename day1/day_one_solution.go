package day1

import (
	"sort"
	"strconv"
	"strings"
)

func Part1(lines []string) int {
	leftColumnList := make([]int, 0)
	rightColumnList := make([]int, 0)
	result := 0

	for _, val := range lines {
		lineValues := strings.Split(val, "   ")
		leftColumnValue, _ := strconv.Atoi(lineValues[0])
		rightColumnValue, _ := strconv.Atoi(lineValues[1])

		leftColumnList = append(leftColumnList, leftColumnValue)
		rightColumnList = append(rightColumnList, rightColumnValue)
	}

	sort.Slice(leftColumnList, func(i, j int) bool {
		return leftColumnList[i] < leftColumnList[j]
	})

	sort.Slice(rightColumnList, func(i, j int) bool {
		return rightColumnList[i] < rightColumnList[j]
	})

	for i, val := range leftColumnList {
		tmp := val - rightColumnList[i]

		if tmp < 0 {
			result += -tmp
		} else {
			result += tmp
		}

	}

	return result
}

func Part2(lines []string) int {
	leftColumnMap := make(map[int]int)
	rightColumnMap := make(map[int]int)
	result := 0

	for _, val := range lines {
		lineValues := strings.Split(val, "   ")
		
		leftColumnValue, _ := strconv.Atoi(lineValues[0])
		rightColumnValue, _ := strconv.Atoi(lineValues[1])

		leftColumnMap[leftColumnValue] += 1
		rightColumnMap[rightColumnValue] += 1 
	}

	for key, val := range leftColumnMap {
		result += key * val * rightColumnMap[key]
	}

	return result
}
