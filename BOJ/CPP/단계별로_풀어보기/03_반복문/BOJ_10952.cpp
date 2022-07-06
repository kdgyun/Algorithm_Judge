/*
	BOJ 10952 : A+B - 5

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int A, B;

	while (true) {
		cin >> A >> B;
		if (A == 0 && B == 0) { // A와 B가 모두 0이라면 while문 종료
			break;
		}
		cout << A + B << "\n";
	}

	return 0;
}
