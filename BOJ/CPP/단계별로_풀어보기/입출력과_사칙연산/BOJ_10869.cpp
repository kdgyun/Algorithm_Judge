/*
    BOJ 10869 : 사칙연산

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
    int a, b;

    scanf("%d %d", &a, &b);
    printf("%d\n", a + b); // 덧셈
    printf("%d\n", a - b); // 뺄셈
    printf("%d\n", a * b); // 곱셈
    printf("%d\n", a / b); // 나눗셈 (몫)
    printf("%d\n", a % b); // 나눗셈 (나머지)
    return 0;
}
