package 별_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ 2522 : 별 찍기 - 12   
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

public class 별찍기_12 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = N; i < j; j--)
				sb.append(' ');
			for (int j = 0; j < i; j++)
				sb.append('*');
			sb.append('\n');
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++)
				sb.append(' ');
			for (int j = 1; j <= N - i; j++)
				sb.append('*');
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
