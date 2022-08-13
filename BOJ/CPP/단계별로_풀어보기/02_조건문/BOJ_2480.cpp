/*
    BOJ 2480 : 주사위 세개

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2022 kdgyun. All rights reserved.
*/

#include <algorithm>
#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {

	ios_base::sync_with_stdio(false);

	int a, b, c;
	cin >> a >> b >> c;

	if (a != b && b != c && a != c) {
		cout << max({ a, b, c }) * 100;
	} else if (a == b && a == c) {
		cout << 10000 + a * 1000;
	} else if (a == b || a == c) {
		cout << 1000 + a * 100;
	} else {
		cout << 1000 + b * 100;
	}
	return 0;
}