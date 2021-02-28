/*
    BOJ 1008 : A/B

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2021 kdgyun. All rights reserved.
*/


#include <stdio.h>

int main(int argc, char const *argv[])
{
    long double a;
    long double b;

    scanf("%Lf %Lf", &a, &b);

    printf("%.12Lf", a / b);
    
    return 0;
}


// Using iostream
/*
#include <iostream>

using namespace std;
int main(int argc, char const *argv[])
{
    double a, b;
    cin >> a >> b;

    cout.precision(12);
    cout << fixed;
    cout << a / b;
    return 0;
}
*/