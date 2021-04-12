/*
	BOJ 2742 : 기찍 N

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

	int N;
	cin >> N;

	for (int i = N; i > 0; i--) {
		cout << i << "\n";
	}
	return 0;
}