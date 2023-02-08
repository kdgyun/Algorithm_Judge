package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 1463 : 1로 만들기  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		System.out.println(recur(N, 0));
	}
 
	static int recur(int N, int count) {
		// N이 2 미만인 경우 누적된 count값을 반환
		if (N < 2) {
			return count;
		}
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
 
	}
}
 
