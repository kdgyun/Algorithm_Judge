package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 10871 : X보다 작은 수
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

public class BOJ_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());

			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}
