package 단계별로_풀어보기.B_07_기본_수학_1;

/**
 * BOJ 10250 : ACM 호텔 
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

public class BOJ_10250 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken());
			st.nextToken(); // W 는 그냥 버린다.
			int N = Integer.parseInt(st.nextToken());

			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');

			} 
			else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);
	}
}