package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 11050 : 이항 계수 1   
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

public class BOJ_11050 {
	static int[][] dp;
	 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		dp = new int[N + 1][K + 1];
 
		System.out.println(BC(N, K));
 
	}
 
	static int BC(int n, int k) {

		if (dp[n][k] > 0) {
			return dp[n][k];
		}

		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}

		return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	}
}
