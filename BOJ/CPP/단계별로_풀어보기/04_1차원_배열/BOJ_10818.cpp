/*
	BOJ 10818 : 최소, 최대

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <algorithm>
#include <iostream>
using namespace std;

int main(int argc, const char *argv[]) {

	ios_base::sync_with_stdio(0);

	// min, max의 초기값
	int minVal = 1000001;
	int maxVal = -1000001;

	int N;
	cin >> N;

	int inputValue;
	while (N--) {
		cin >> inputValue;
		minVal = min(minVal, inputValue);
		maxVal = max(maxVal, inputValue);
	}

	cout << minVal << " " << maxVal;
	return 0;
}