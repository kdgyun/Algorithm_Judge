package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 2908 : 상수
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.IOException;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException {
		int A = 0;
		int B = 0;

		A += System.in.read() - 48;
		A += (System.in.read() - 48) * 10;
		A += (System.in.read() - 48) * 100;

		System.in.read(); // 공백

		B += System.in.read() - 48;
		B += (System.in.read() - 48) * 10;
		B += (System.in.read() - 48) * 100;

		System.out.println(A > B ? A : B);
	}
}
