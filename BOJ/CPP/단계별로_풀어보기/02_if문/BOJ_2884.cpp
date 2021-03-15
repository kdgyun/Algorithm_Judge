/*
	BOJ 2884 : 알람 시계 

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
	int h; // 시
	int m; // 분

	cin >> h >> m;

	// 만약 입력받은 분이 45분 미만일 경우
	if (m < 45) {
		h--;
		m = 60 - (45 - m);

		// 만약 시(hour)가 음수가 될 경우
		if (h < 0) {
			h = 23;
		}
	} else {
		m = (m - 45);
	}

	cout << h << " " << m;

	return 0;
}
