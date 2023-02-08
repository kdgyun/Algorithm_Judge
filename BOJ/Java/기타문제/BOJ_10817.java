package 기타문제;

/**
 * BOJ 10817 : 세 수
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10817 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a >= b) {
			if (a >= c) {
				// a가 가장 크거나 모두 같을 경우
				if (b >= c)
					System.out.println(b);
				else
					System.out.println(c);
			} else
				System.out.println(a);
		} else {
			if (c <= b) { // b가 가장 큰 수일 경우
				if (c <= a)
					System.out.println(a);
				else
					System.out.println(c);
			} else
				System.out.println(b);
		}
	}
}
