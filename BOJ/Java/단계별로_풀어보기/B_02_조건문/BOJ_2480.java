package 단계별로_풀어보기.B_02_조건문;

/**
 * BOJ 2480 : 주사위 세개
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
 
public class BOJ_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
 
		// 만약 모든 변수가 다른 경우
		if (a != b && b != c && a != c) {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
		// 3개의 변수가 모두 같은 경우
		else if (a == b && a == c) {
			System.out.println(10000 + a * 1000);
		}
		// a가 b혹은 c랑만 같은 경우
		else if(a == b || a == c) {
			System.out.println(1000 + a * 100);
		}
		// b가 c랑 같은 경우
		else {
			System.out.println(1000 + b * 100);
		}
	}
}