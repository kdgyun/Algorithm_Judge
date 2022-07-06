/*
	BOJ 1110 : 더하기 사이클

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
	int init, N, count = 0;
	cin >> init;

	N = init;

	do {
		// N에 대해 반복하므로 연산된 값도 N으로 덮어써준다.
		N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;

		count++; // 사이클 수 증가
	} while (init != N);

	cout << count;	// 사이클 수 출력
	return 0;
}