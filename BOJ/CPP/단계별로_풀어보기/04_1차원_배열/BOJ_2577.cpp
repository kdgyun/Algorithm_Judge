/*
	BOJ 2577 : 숫자의 개수

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
	cin.tie(NULL);
	
	/*
	  0으로 초기화를 해야한다. 
	  아니면 garbage value, 즉 쓰레기 값이 들어있게 된다.
	  이 때 0으로 초기화 하는 방법은 {} 괄호만 쳐주거나,
	  {0,}, {0} 방식이 있다.
	 */
	int count[10] = {};
	int a, b, c;

	cin >> a >> b >> c;

	int res = a * b * c;


	// 곱한 값이 0이 될 때 까지 반복
	while(res != 0) {
		count[res % 10]++;	// res에서 나머지 10을 통해 자릿수를 얻어 인덱스로 활용
		res /= 10;			//  매 회 자릿수를 줄이기 위해 10을 나눈다.
	}

	// 0 부터 9까지 count 배열을 출력한다. (foreach문 사용)
	for (int v : count) {
		cout << v << "\n";
	}
	return 0;
}