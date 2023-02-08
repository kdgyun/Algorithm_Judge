package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 1003 : 피보나치 함수  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_1003 {
 
	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
		dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
		dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
		dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T --> 0){
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
		System.out.println(sb);
	}
	
	static Integer[] fibonacci(int N) {
		// N에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
		if(dp[N][0] == null || dp[N][1] == null) {
			// 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		// N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
		return dp[N];
 
	}
 
}