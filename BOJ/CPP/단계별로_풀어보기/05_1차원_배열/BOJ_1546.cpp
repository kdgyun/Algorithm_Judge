/*
	BOJ 1546 : 평균

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
	cout.tie(0);

	int N;	// 시험 본 과목 개수
	int M = -1;	// 입력받은 정수중 최대값을 담기위한 변수
	double sum = 0;

	cin >> N;

	double v;
	for(int i = 0; i < N; i++) {
		cin >> v;
		sum += v;	// 성적 누적합
		if(M < v) {	// 만약 기존 최댓값보다 크다면 입력받은 정수로 갱신
			M = v;
		}	
	}

	/*
	 성적 평균 = (((단일 성적1 / 최댓 값) + ... + (단일 성적 N / 최댓 값)) / N ) * 100
	           = (((단일 성적1  + ... + 단일 성적 N) / 최댓 값) / N ) * 100
	*/
	cout << ((sum / M) / N) * 100 ;

	return 0;
}