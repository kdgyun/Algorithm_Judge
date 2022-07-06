package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 1316 : 그룹 단어 체커
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int count = 0;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}

	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				} 
				else {
					return false;
				}
			}
		}
		return true;
	}
}
