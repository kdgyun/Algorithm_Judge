/*
    BOJ 25083 : 새싹

    author : kdgyun
    link https://st-lab.tistory.com
    link https://github.com/kdgyun
    Created by kdgyun
    Copyright © 2022 kdgyun. All rights reserved.
*/
#include <iostream>
#include <string>

using namespace std;

int main(int argc, char const *argv[]) {

	string s = "         ,r'\"7\n";   // \", \n 이 제어문자다.
	       s += "r`-_   ,'  ,/\n";    // \n 이 제어문자다.
	       s += " \\. \". L_r'\n";    // \\, \", \n 이 제어문자다.
	       s += "   `~\\/\n";         // \\, \n 이 제어문자다.
	       s += "      |\n";          // \n 이 제어문자다.
	       s += "      |";
	cout << s;
	return 0;
}
