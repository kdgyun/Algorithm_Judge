package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 1110: 더하기 사이클
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		int copy = N;
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);

		System.out.println(cnt);
	}
}
