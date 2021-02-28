/*
    BOJ 2588 : 곱셈

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
    int A, B;

    scanf("%d %d", &A, &B);

    printf("%d\n", A * (B % 10));
    printf("%d\n", A * ((B % 100) / 10));
    printf("%d\n", A * (B / 100));
    printf("%d\n", A * B);

    return 0;
}

/*
#include <iostream>
#include <string>   // string, stoi()을 쓰기 위한 헤더파일

using namespace std;

int main(int argc, char const *argv[])
{
    int A;
    string B;

    cin >> A;
    cin >> B;

    cout << A * (B[2] - '0') << "\n";
    cout << A * (B[1] - '0') << "\n";
    cout << A * (B[0] - '0') << "\n";
    cout << A * stoi(B) << "\n";    // string -> int(10진수) 로 변환
    return 0;
}
*/