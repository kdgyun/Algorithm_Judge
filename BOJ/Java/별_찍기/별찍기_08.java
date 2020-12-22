package 별_찍기;

/**
 * BOJ 2445 : 별 찍기 - 8     
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_08 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				sb.append('*');
			}
			for (int j = 0; j < 2 * (N - i - 1); j++) {
				sb.append(' ');
			}
			for (int j = 0; j < i + 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}

		for (int i = N - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			for (int j = 0; j < (N - i) * 2; j++) {
				sb.append(' ');
			}
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}
