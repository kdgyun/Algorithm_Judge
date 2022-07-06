package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 109521: A+B - 4
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_10951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		String str;

		while ((str = br.readLine()) != null) {

			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a + b).append("\n");

		}
		System.out.print(sb);

	}
}
