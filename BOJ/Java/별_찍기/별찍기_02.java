package 별_찍기;

/**
 * BOJ 2439 : 별 찍기 - 2
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				sb.append(' ');
			}
			for (int k = 0; k < i; k++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
