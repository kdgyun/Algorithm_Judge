/*
    BOJ 9498 : 시험 성적

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {

    int score;
    cin >> score;

    if (score >= 90) {
        cout << "A";
    } else if (score >= 80) {
        cout << "B";
    } else if (score >= 70) {
        cout << "C";
    } else if (score >= 60) {
        cout << "D";
    } else {
        cout << "F";
    }
    return 0;
}
