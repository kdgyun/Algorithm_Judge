package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 8958 : OX퀴즈
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_8958 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스

		for (int i = 0; i < T; i++) {

			int cnt = 0; // 연속횟수
			int sum = 0; // 누적 합산

			for (byte value : br.readLine().getBytes()) {
				
				if (value == 'O') {
					cnt++;
					sum += cnt;
				} 
				else {
					cnt = 0;
				}
			}
			
			sb.append(sum).append('\n');

		}
		System.out.println(sb);

	}
}
