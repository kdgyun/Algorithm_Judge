/*
    BOJ 2525 : 오븐 시계

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2022 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {

	ios_base::sync_with_stdio(false);

	int A, B, C;
	cin >> A >> B >> C;

	int min = 60 * A + B; // 시 -> 분
	min += C;

	int hour = (min / 60) % 24;
	int minute = min % 60;

	cout << hour << " " << minute;
	return 0;
}
