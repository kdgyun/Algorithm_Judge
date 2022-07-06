package 단계별로_풀어보기.B_02_조건문;

/**
 * BOJ 9498 : 시험 성적
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_9498 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());

		if (A >= 90)
			System.out.println("A");
		else if (A >= 80)
			System.out.println("B");
		else if (A >= 70)
			System.out.println("C");
		else if (A >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}
}
