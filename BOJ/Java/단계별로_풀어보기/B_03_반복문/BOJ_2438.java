package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 2439 : 별찍기 - 1
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}

}
