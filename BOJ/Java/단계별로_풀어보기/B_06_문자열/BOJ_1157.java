package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 10809 : 문자열 반복
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.IOException;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException {

		int[] arr = new int[26]; // 영문자의 개수는 26개임

		int c = System.in.read();

		while (c > 64) { // 공백을 입력받는 순간 종료됨

			if (c < 91) {
				arr[c - 65]++;
			} else {
				arr[c - 97]++;
			}
			c = System.in.read();
		}

		int max = -1;
		int ch = -2; // ? 는 63 이다.

		for (int i = 0; i < 26; i++) {

			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch + 65));
	}
}
