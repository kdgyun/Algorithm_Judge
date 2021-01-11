package 별_찍기;

/**
 * BOJ 13015 : 별 찍기 - 23  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_23 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		

		for (int i = 0; i < N; i++) {
			sb.append('*');
		}
		for (int i = 0; i < N * 2 - 3; i++) {
			sb.append(' ');
		}
		for (int i = 0; i < N; i++) {
			sb.append('*');
		}

		sb.append('\n');

		for (int i = 2; i < N; i++) {
			for (int j = 1; j < i; j++) {
				sb.append(' ');
			}
			sb.append('*');
			for (int j = 1; j < N - 1; j++) {
				sb.append(' ');
			}
			sb.append('*');
			for (int j = 0; j < 2 * (N - i) - 1; j++) {
				sb.append(' ');
			}
			sb.append('*');
			for (int j = 1; j < N - 1; j++) {
				sb.append(' ');
			}
			sb.append('*').append('\n');

		}
		for (int i = 1; i < N; i++) {
			sb.append(' ');
		}
		sb.append('*');
		for (int i = 1; i < N - 1; i++) {
			sb.append(' ');
		}
		sb.append('*');
		for (int i = 1; i < N - 1; i++) {
			sb.append(' ');
		}
		sb.append('*').append('\n');

		String[] ss = sb.toString().split("\n");
		
		for(int i = ss.length - 2; i >= 0; i--) {
			sb.append(ss[i]).append('\n');
		}
		System.out.println(sb);
	}

}
