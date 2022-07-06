/*
	BOJ 15596 : 정수 N개의 합

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/

#include <vector>

long long sum(std::vector<int> &a) {
	long long ans = 0;
	for (int i = 0; i < a.size(); i++) {
		ans += a[i];
	}
	return ans;
}