/*
	BOJ 4344 : 평균은 넘겠지

	author : kdgyun
	link https://st-lab.tistory.com
	link https://github.com/kdgyun
	Created by kdgyun
	Copyright © 2021 kdgyun. All rights reserved.
*/
#include <iostream>

using namespace std;

void func();

int main(int argc, const char *argv[]) {

	ios_base::sync_with_stdio(0);
	cin.tie(nullptr);

	int C;
	cin >> C; // test case

	for (int i = 0; i < C; i++) {
		func();
	}

	return 0;
}

void func() {
	int N;
	cin >> N;

	// 동적 배열 선언 및 생성
	int *arr = new int[N]; // 혹은 int* arr = (int*)malloc(sizeOf(int) * size)

	for (int i = 0; i < N; i++) {
		cin >> arr[i]; // i ~ N - 1 까지 입력받은 요소로 초기화
	}

	// 평균 구하기
	double avg = 0;
	for (int i = 0; i < N; i++) {
		avg += arr[i]; // 모든 성적 누적합
	}
	avg = avg / N; // 누적합에 대해 N으로 나눈다.

	// 평균 점수를 넘는 인원 수 구하기
	double count = 0;
	for (int i = 0; i < N; i++) {
		if (arr[i] > avg) {
			count++;
		}
	}

	// 평균을 넘는 인원 %
	double result = (count / N) * 100;
	cout << fixed;
	cout.precision(3);
	cout << result << "%\n";

	delete[] arr;
}