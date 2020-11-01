package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 1000 : A+B
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1000 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = br.read() - '0';
		br.read();
		int b = br.read() - '0';
		
		System.out.println(a + b);

	}

}