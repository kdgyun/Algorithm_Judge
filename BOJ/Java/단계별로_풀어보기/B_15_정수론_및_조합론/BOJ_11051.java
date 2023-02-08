package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 11051 : 이항 계수 2  
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

public class BOJ_11051 {
	public static final int div = 10007;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		/*
		 *   n! / ((n-k)! * k!)   ->   n! * ((n-k)! * k!)^(-1) 으로 변환
		 *   ((n-k)! * k!)^(-1) == ((n-k)! * k!)^(p-2) 동치  
		 *   p(=div)가 소수여서 가능함)
		 */
		System.out.println((factorial(N) * mod_inverse((factorial(N - K) * factorial(K)) % div, div - 2)) % div);
	}

	static int factorial(int N) {
		// factorial(0) == 1 이다.
		if (N <= 1) {
			return 1;
		}
		return (N * factorial(N - 1)) % div;
	}

	static int mod_inverse(int a, int p) {
		int ret = 1;
		while(p > 0) {
			if(p % 2 == 1) {
				ret *= a;
				p--;
				ret %= div;
			}
			a *= a;
			a %= div;
			p >>>= 1;	
		}
		return ret;
	}
}
