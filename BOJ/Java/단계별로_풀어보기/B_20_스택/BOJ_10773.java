package 단계별로_풀어보기.B_20_스택;

/**
 * BOJ 10773 : 제로    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_10773 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int top = -1;
 
		int K = Integer.parseInt(br.readLine());
		int[] arr = new int[K];
		
 
		for(int i = 0; i < K; i++) {
			
			int number = Integer.parseInt(br.readLine());
			
			if (number == 0) {
				top--;	
			} 
			else {
				top++;
				arr[top] = number;	
			}
		}
		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
 
	}
}
