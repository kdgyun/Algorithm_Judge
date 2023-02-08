package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 11053 : 가장 긴 증가하는 부분 수열  
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

public class BOJ_11053 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
		int[] dp = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			dp[i] = 1;
		    
			// 0 ~ i 이전 원소들 탐색
			for(int j = 0; j < i; j++) {
		    
				// j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
				if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
				}
			}
		}
		
		// 최댓값(최대 길이) 탐색 
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
		
	}
 
}


/*
 N log N LIS
 
 public class BOJ_11053 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] seq = new int[N];
		int[] LIS = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		LIS[0] = seq[0];
		int idx = 1;
 
		for(int i = 1; i < N; i++) {
			if(LIS[idx - 1] < seq[i]) {
				LIS[idx++] = seq[i];
			}
			else if(LIS[0] > seq[i]) {
				LIS[0] = seq[i];
			}
			else {
				int temp = Arrays.binarySearch(LIS, 0, idx, seq[i]);
				LIS[temp < 0 ? -(temp + 1) : temp] = seq[i];
			}
		}
		System.out.println(idx);
	}
}
 */
