package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 10720 : 숫자의 합
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

		int k = 0;

		for (byte a : br.readLine().getBytes()) {
			k += (a - '0');
		}

		System.out.print(k);

	}
}
