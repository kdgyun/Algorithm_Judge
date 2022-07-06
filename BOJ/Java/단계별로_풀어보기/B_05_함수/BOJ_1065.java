package 단계별로_풀어보기.B_05_함수;

/**
 * BOJ 1065 : 한수
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1065 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));

	}

	public static int arithmetic_sequence(int num) {

		if (num < 100) {
			return num;
		}

		int cnt = 99; // 한수 카운팅

		for (int i = 100; i <= num; i++) {
			int hun = i / 100; // 백의 자릿수
			int ten = (i / 10) % 10; // 십의 자릿수
			int one = i % 10;

			if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
				cnt++;
			}
		}

		return cnt;
	}

}
