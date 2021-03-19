/*
	BOJ 2739 : 구구단

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
	int N;
	cin >> N;

	for (int i = 1; i < 10; i++) {
		cout << N << " * " << i << " = " << N * i << "\n";
	}
	return 0;
}
