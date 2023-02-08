package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 3036 : 링   
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

public class BOJ_3036 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// 첫 번째 링
		int firstRing = Integer.parseInt(st.nextToken());
 
		for (int i = 1; i < N; i++) {
			
			int otherRing = Integer.parseInt(st.nextToken());
			
			// 기약분수로 만들기 위한 최대공약수 찾기
			int gcd = gcd(firstRing, otherRing);
 
			// 분모와 분자를 최대공약수로 나눠주기 
			sb.append(firstRing / gcd).append('/').append(otherRing / gcd).append('\n');
		}
		
		System.out.println(sb);
 
	}
 
	// 최대공약수 메소드
	static int gcd(int a, int b) {
		int r;
 
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
