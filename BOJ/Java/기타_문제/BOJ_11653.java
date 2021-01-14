package 기타_문제;

/**
 * BOJ 11653 : 소인수분해
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
	}
}
