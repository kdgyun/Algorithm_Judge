package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 2004 : 조합 0의 개수 
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
 
public class BOJ_2004 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		long count5 = five_power_n(N) - five_power_n(N - M) - five_power_n(M);
		long count2 = two_power_n(N) - two_power_n(N - M) - two_power_n(M);
		System.out.println(Math.min(count5, count2));
 
	}

	static long five_power_n(long num) {
		int count = 0;
 
		while (num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}
 
	static long two_power_n(long num) {
		int count = 0;
 
		while (num >= 2) {
			count += (num / 2);
			num /= 2;
		}
		return count;
	}
 
}
