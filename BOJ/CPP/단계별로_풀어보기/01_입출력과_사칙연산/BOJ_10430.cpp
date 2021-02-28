/*
    BOJ 10430 : 나머지

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);

    printf("%d\n", (A + B) % C);
    printf("%d\n", (A % C + B % C) % C);
    printf("%d\n", (A * B) % C);
    printf("%d\n", (A % C * B % C) % C);
    return 0;
}
