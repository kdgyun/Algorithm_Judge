/*
	BOJ 15552 : 빠른 A+B 

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int T, a, b;

	cin >> T;
	for(int i = 0; i < T; i++){
		cin >> a >> b;
		cout << a + b << "\n";
	}

	return 0;
}
