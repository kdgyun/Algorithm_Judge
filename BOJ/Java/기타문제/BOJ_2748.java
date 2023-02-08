package 기타문제;

/**
 * BOJ 2748 : 피보나치 수 2  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_2748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		long sum = 1;
		long f1 = 0;
		long f2 = 1;
		
		for(int i = 1 ; i < N ; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		
		System.out.println(sum);
	}
}