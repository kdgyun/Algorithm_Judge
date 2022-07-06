package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 2739 : 구구단
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2739 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10; i++) {

			sb.append(N).append(" * ").append(i).append(" = ").append(N * i).append('\n');

		}

		System.out.println(sb);
	}
}
