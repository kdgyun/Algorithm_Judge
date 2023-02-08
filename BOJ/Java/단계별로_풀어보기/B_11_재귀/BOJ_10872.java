package 단계별로_풀어보기.B_11_재귀;

/**
 * BOJ 10872 : 팩토리얼
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

// using loop

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_10872 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = 1;
        
		// N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(N != 0) {
			sum = sum * N;
			N--;
		}
        
		System.out.println(sum);
		
	}
}

// using Recursion

/**

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;	// 재귀 종료조건
		return N * factorial(N - 1);		
	}
 
}

*/