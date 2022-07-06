/*
    BOJ 14681 : 사분면 고르기

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
    int X, Y;
    cin >> X >> Y;

    cout << (X > 0 ? (Y > 0 ? 1 : 4) : (Y > 0 ? 2 : 3));
    return 0;
}
