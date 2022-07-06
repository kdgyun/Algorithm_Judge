package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 11021 : A+B - 7
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_11021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while (true) {

			String str = br.readLine();

			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;

			if (A == 0 && B == 0) {
				break;
			}
			sb.append((A + B)).append('\n');
		}
		System.out.println(sb);
	}
}
