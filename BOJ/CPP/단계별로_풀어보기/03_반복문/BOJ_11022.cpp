/*
	BOJ 11022 : A+B - 8

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
	
	int T;
	cin >> T;	// Test Case

	for (int i = 1; i <= T; i++) {
		int a;
		int b;
		cin >> a >> b;

		cout << "Case #" << i << ": " << a << " + " << b << " = " << a + b << "\n"; //(또는 endl;)
	}
	return 0;
}
