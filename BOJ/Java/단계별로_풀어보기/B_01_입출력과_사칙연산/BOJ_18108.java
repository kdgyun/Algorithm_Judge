package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 18108 : 1998년생인 내가 태국에서는 2541년생?! 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_18108 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		System.out.println(year - 543);
	}
}
