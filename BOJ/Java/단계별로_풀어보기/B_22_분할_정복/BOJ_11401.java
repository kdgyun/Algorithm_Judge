package 단계별로_풀어보기.B_22_분할_정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * BOJ 11401 : 이항 계수 3      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


public class BOJ_11401 {
	
	final static long P = 1000000007;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		
		// 분자 N!
		long numer = factorial(N);
		
		// 분모 (K! * (N-K)!) mod p
		long denom = factorial(K) * factorial(N - K) % P;	
	
		
		// N! * 분모의 역원((K! * (N-K)!) 
		System.out.println(numer * pow(denom, P - 2) % P);
		
	}
	
	
	// 팩토리얼 함수 
	public static long factorial(long N) {
		long fac = 1L;
		
		while(N > 1) {
			fac = (fac * N) % P;
			N--;
		}
		return fac;
	}
	
	
	/*
	 * 역원 구하는 함수 
	 * 
	 * base : 밑,   expo = 지수 (exponent)
	 * 
	 * 거듭 제곱을 분할 정복 방식으로 푼다.
	 * 
	 * 
	 */
	public static long pow(long base, long expo) {
	    long result = 1;    
	    
	    while (expo > 0) {
	    	
	    	// 지수가 홀 수면 밑을 한 번 더 곱하여 지수가 짝수가 되도록 한다.
	        if (expo % 2 == 1) {
	            result *= base;
	            result %= P;
	        }
	        base = (base * base) % P;
	        expo >>= 2;
	    }
	    return result;
	}
	

	

}
