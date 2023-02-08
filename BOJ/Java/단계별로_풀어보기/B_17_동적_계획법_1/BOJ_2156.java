package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 2156 : 포도주 시식 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
// recursion (Top-down)

public class BOJ_2156 {
	
	static Integer[] dp;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N + 1];
		arr = new int[N + 1];
		
		for(int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		/*
		 *  (N이 1로 주어질 수 있으므로 이럴 때를 위해 조건식을 달아둔다.
		 *  또한 dp[2]는 어떤 경우에도 첫 번째와 두 번째를 합한 것이 최댓값이다. 
		 */
		if(N > 1) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(recur(N));
	}
	
	static int recur(int N) {
		
		if(dp[N] == null) {
			dp[N] = Math.max(Math.max(recur(N - 2), recur(N - 3) + arr[N - 1]) + arr[N], recur(N - 1));
		}
		
		return dp[N];
	}
}

/*
 for-loop (bottom-up) 
 
public class BOJ_2156 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		int[] arr = new int[N + 1];
		int[] dp = new int[N + 1];
 
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		dp[1] = arr[1];
		if (N > 1) {
			dp[2] = arr[1] + arr[2];
		}
		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
 
		}
		System.out.println(dp[N]);
	}
 
}

*/