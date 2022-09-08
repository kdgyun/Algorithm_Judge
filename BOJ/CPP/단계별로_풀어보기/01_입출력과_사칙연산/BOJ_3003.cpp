/*
    BOJ 3003 : 킹, 퀸, 룩, 비숍, 나이트, 폰

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {

	int king = 1;
	int queen = 1;
	int rook = 2;
	int bishop = 2;
	int knight = 2;
	int pawn = 8;

    // 입력받을 변수
	int in_king, in_queen, in_rook, in_bishop, in_knight, in_pawn;

	cin >> in_king;
	cin >> in_queen;
	cin >> in_rook;
	cin >> in_bishop;
	cin >> in_knight;
	cin >> in_pawn;

	// 참고로 출력형식을 보면 각 변수들사이에 공백으로 구분 된한 줄로 출력해야한다.
	cout << king - in_king << " ";
	cout << queen - in_queen << " ";
	cout << rook - in_rook << " ";
	cout << bishop - in_bishop << " ";
	cout << knight - in_knight << " ";
	cout << pawn - in_pawn << " ";
}
