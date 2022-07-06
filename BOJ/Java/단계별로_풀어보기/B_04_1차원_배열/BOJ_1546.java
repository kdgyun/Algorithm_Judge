package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 1546 : 평균
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = -1;
		int sum = 0;
		int value;
		
		for (int i = 0; i < N; i++) {
			
			value = Integer.parseInt(st.nextToken());

			if (value > max) {
				max = value;
			}

			sum += value;
		}

		System.out.println(((sum / (double) max) * 100) / N);

	}
}
