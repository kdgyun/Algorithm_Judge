/*
    BOJ 1330 : 두 수 비교하기

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
    int A, B;
    cin >> A >> B;
    cout << ((A > B) ? ">" : (A < B) ? "<" : "==");
    return 0;
}
