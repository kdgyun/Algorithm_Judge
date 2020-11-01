package 별_찍기;

/**
 * BOJ 2442 : 별 찍기 - 5
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class 별찍기_05 {

	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int i, j, k, l;
		int cnt = 0;

		for (i = a; i > 0; i--) {
			for (j = 0; j < i - 1; j++) {
				sb.append(" ");
			}
			for (k = 0; k < (a - (i - 1)); k++) {
				sb.append("*");
			}
			for (l = 0; l < cnt; l++) {
				sb.append("*");
			}
			cnt++;
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
