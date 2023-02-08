package 단계별로_풀어보기.B_22_분할_정복;

/**
 * BOJ 11444 : 피보나치 수 6      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_11444 {
	
	final static long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		long N = Long.parseLong(br.readLine());
		
		// N이 1이거나 0이라면 N을 출력하고 종료
		if(N == 1 || N == 0) {
			System.out.println(N);
			return;
		}
		
		// A^(n-1)의 [0][0] 원소를 구하면 되므로 1을 빼준다. 
		N--;
		
		long[][] origin = {{1, 1},{1, 0}};
		long[][] A = {{1, 0},{0, 1}};	// 초기 값은 단위행렬(I)로 초기화해준다.
		
		/*
		 * origin 행렬은 이전 loop에서 제곱값을 갖고있는 행렬이고,
		 * A는 지수가 홀 수 일 때, 이전 loop에서 얻은 제곱 행렬인 origin과
		 * 현재 A 행렬을 곱해주는 방식으로 간다.
		 * 
		 * 즉, 재귀 과정을 역순으로 거치면 된다.
		 * 
		 * ex)
		 * A^11 과정일 떄,
		 * 
		 * N = 11 (N % 2 == 1) -> I * A^1 = A^1 (result)
		 *                     -> A^1 * A^1 = A^2 (origin)
		 *                     
		 * N = 5  (N % 2 == 1) -> A^1 * A^2 = A^3 (result)
		 *                     -> A^2 * A^2 = A^4 (origin)
		 *                     
		 * N = 2  (N % 2 == 0) -> A^4 * A^4 = A^8 (origin)
		 *
		 * N = 1  (N % 2 == 1) -> A^3 * A^8 = A^11 (result)
		 *                     -> A^8 * A^8 = A^16 (origin)  
		 */
		while(N > 0) {
			
			// 지수가 홀수라면 origin 배열을 한 번 더 곱해준다.
			if(N % 2 == 1) {	// b % 2 == 1 을 (b & 1L) != 0L 으로도 수정할 수 있다.
				A = multiply(A, origin);
			}
			origin = multiply(origin, origin);
			
			N /= 2;
		}
		
		System.out.println(A[0][0]);
		
	}
	
	// o1과 o2 행렬을 곱해주는 메소드
	public static long[][] multiply(long[][] o1, long[][] o2) {
		
		long[][] ret = new long[2][2];

		ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % MOD;
		ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % MOD;
		ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % MOD;
		ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % MOD;

		
		// 반복문으로 작성해주어도 무방함
		/*
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < 2; i++) {							
				for (int j = 0; j < 2; j++) {
					ret[i][j] += o1[i][k] * o2[k][j];
					ret[i][j] %= MOD;
				}
			}
		}
		*/
		return ret;
	}
}
