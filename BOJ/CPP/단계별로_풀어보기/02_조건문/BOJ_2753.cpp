/*
    BOJ 2753 : 윤년 

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
    int y;
    cin >> y;
    cout << ((y % 4 == 0) ? ((y % 400 == 0) ? 1 : (y % 100 != 0) ? 1 : 0) : 0);

    return 0;
}
