package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 9184 : 신나는 함수 실행
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

public class BOJ_9184 {

	/*
	 * 함수 w에서 a, b, c 중 20이 넘어가게 되면 w(20, 20, 20)을 호출하고,
	 * 0 이하일 경우는 1을 반환하기 때문에
	 * 각 배열의 크기가 21 (0~20)을 넘기지 않는다.
	 */
	static int[][][] dp = new int[21][21][21];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			// -1 -1 -1 이 나오면 종료
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a ,b ,c)).append('\n');
			
		
		}
		
		System.out.println(sb);
	}
	
	static int w(int a, int b, int c) { 
		
		// a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
		if(inRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		
		if(a < b && b < c) {
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		
		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}
	
	/*
	 *  배열을 참조하려 할 때 a, b, c 중 하나라도 범위 밖의 수가
	 *  나올 수 있기 때문에 이를 체크를 해주기 위한 함수다.
	 */
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
}
