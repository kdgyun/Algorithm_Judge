package 단계별로_풀어보기.B_19_그리디_알고리즘;

/**
 * BOJ 13305 : 주유소
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

public class BOJ_13305 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[] dist = new long[N - 1];
		long[] cost = new long[N];
		
		// 거리 입력 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N - 1; i++) {
			dist[i] = Long.parseLong(st.nextToken());
		}
		
		// 리터당 기름값 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			cost[i] = Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
		long minCost = cost[0];	// 이전 까지의 과정 중 주유 최소 비용 

		for(int i = 0; i < N - 1; i++) {
			
			/*
			 *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 *  minCost를 갱신해준다. 
			 */
			if(cost[i] < minCost) {
				minCost = cost[i];
			}
			
			sum += (minCost * dist[i]);
		}
		
		System.out.println(sum);
		
	}
}
