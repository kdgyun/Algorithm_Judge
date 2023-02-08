package 단계별로_풀어보기.B_22_분할_정복;

/**
 * BOJ 1629 : 곱셈      
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

public class BOJ_1629 {

	public static long C;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A, B));
	}
	
	// A^exponent
	public static long pow(long A, long exponent) {
		
		// 지수가 1일 경우 A^1 이므로 A를 그대로 리턴
		if(exponent == 1) {
			return A % C;
		}
		
		// 지수의 절반에 해당하는 A^(exponent / 2) 을 구한다.
		long temp = pow(A, exponent / 2);
		
		/*
		 * 현재 지수가 홀 수 였다면
		 * A^(exponent / 2) * A^(exponent / 2) * A 이므로
		 * A를 한 번 더 곱해주어야 한다.
		 * 
		 * ex) A^9 = A^4 * A^4 * A
		 */
		if(exponent % 2 == 1) {
			return (temp * temp % C) * A % C;
		}
		return temp * temp % C;
		
	}
	
}
