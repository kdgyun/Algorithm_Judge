package 단계별로_풀어보기.B_22_분할_정복;

/**
 * BOJ 10830 : 행렬 제곱      
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

public class BOJ_10830 {

	final static int MOD = 1000;
	public static int N;
	public static int[][] origin;	// A^1 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		origin = new int[N][N];
		
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				
				/*
				 * B=1 일 때는 pow과정에서 바로 A가 반환 될 수 있다.
				 * 이 때의 경우 만약 원소가 1000이상일 경우 pow메소드에서 모듈러연산이
				 * 실행되지 않기 때문에 오답이 되어버린다.
				 * 
				 * 이를 방지하기 위해 초기 행렬에도 1000으로 나눈 나머지 값으로
				 * 초기화를 해준다.
				 */
				origin[i][j] = Integer.parseInt(st.nextToken()) % MOD;
			}			
		}
		
		int[][] result = pow(origin, B);
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int val : result[i]) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	public static int[][] pow(int[][] A, long exp) {

		// 지수가 1일 땐 A를 return한다.
		if(exp == 1) {
			return A;
		}
		
		// 분할하여 들어간다.
		int[][] ret = pow(A, exp / 2);
		
		// 하위 메소드에서 얻은 행렬을 제곱해준다.
		ret = multiply(ret, ret);
		
		// 만약 지수가 홀수라면 마지막에  A^1 을 곱해준다.
		if((exp & 1) != 0) {
			ret = multiply(ret, origin);
		}
		
		return ret;
	}
	
	
	// o1과 o2 행렬을 곱해주는 메소드
	public static int[][] multiply(int[][] o1, int[][] o2) {
		
		int[][] ret = new int[N][N];

		int r;
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {				
				r = o1[i][k];			
				for (int j = 0; j < N; j++) {
					ret[i][j] += r * o2[k][j];
					ret[i][j] %= MOD;
				}
			}
		}
		
		return ret;
	}
}
