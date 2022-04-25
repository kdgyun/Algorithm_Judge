package 단계별로_풀어보기.B_20_이분_탐색;

/**
 * BOJ 12015 : 가장 긴 증가하는 부분 수열 2
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

public class BOJ_12015 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] seq = new int[N];
		int[] LIS = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		LIS[0] = seq[0];
		int length = 1;
		for (int i = 1; i < N; i++) {

			if (LIS[length - 1] < seq[i]) {
				length++;
				LIS[length - 1] = seq[i];
			} else {

				int lo = 0;
				int hi = length;
				while (lo < hi) {
					int mid = (lo + hi) >>> 1;
					
					if(LIS[mid] < seq[i]) {
						lo = mid + 1;
					}
					else {
						hi = mid;
					}

				}
				LIS[lo] = seq[i];
			
			}
			
		}
		System.out.println(length);
	}
}
