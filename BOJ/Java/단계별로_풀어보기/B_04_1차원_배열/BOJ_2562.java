package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 2562 : 최댓값 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {

			int val = Integer.parseInt(br.readLine());

			if (val > max) {
				max = val;
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);
	}
}
