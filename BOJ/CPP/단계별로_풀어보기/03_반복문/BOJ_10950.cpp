/*
	BOJ 10950 : A+B - 3

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
	int T, A, B;

	cin >> T; // 테스트 케이스

	// 테스트 케이스만큼 반복
	for (int i = 0; i < T; i++) {
		cin >> A >> B;
		cout << A + B << "\n";
	}
	return 0;
}
