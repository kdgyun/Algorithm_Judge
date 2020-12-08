package 별_찍기;

/**
 * BOJ 2443 : 별 찍기 - 6
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_06 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = N; i > 0; i--) {
			for (int j = 0; j < N - i; j++) {
				sb.append(' ');
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}