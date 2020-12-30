package 별_찍기;


/**
 * BOJ 10991 : 별 찍기 - 16
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_16 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int p = N - 1;
		int l = -1;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < p; j++) {
				sb.append(' ');
			}

			sb.append('*');

			if (i != 0) {
				for (int j = 0; j <= l; j++) {
					if (j % 2 == 0) {
						sb.append(' ');
					} 
					else {
						sb.append('*');
					}
				}

			}
			sb.append('\n');
			p--;
			l += 2;
		}

		System.out.print(sb);
	}
}


