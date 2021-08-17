/*
	BOJ 2562 : 최댓값

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, const char *argv[]) {

	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int maxValue = -1;	
	int maxValueIndex;	
	int num;	
	
	for (int i = 1; i < 10; i++) {
		cin >> num;
		if (num > maxValue) {
			maxValue = num;
			maxValueIndex = i;
		}
	}
	cout << maxValue << "\n" << maxValueIndex + 1;

	return 0;
}