package 별_찍기;

/**
 * BOJ 10992 : 별 찍기 - 17
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_17 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int p = N - 1;
		int l = -1;

		StringBuilder sb = new StringBuilder();


		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < p; j++) {
				sb.append(' ');
			}

			sb.append('*');

			if (i != 0) {
				for (int j = 0; j < l; j++) {
					sb.append(' ');
				}
				sb.append('*');
			}
			sb.append('\n');
			p--;
			l += 2;
			
		}

		for(int i = 0; i <= p + l + 1; i++) {
			sb.append('*');
		}
		System.out.print(sb);
	}
}


