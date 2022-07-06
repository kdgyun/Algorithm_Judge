package 단계별로_풀어보기.B_02_조건문;

/**
 * BOJ 2753 : 윤년
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2753 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int y = Integer.parseInt(br.readLine());

		System.out.print((y % 4 == 0) ? ((y % 400 == 0) ? "1" : (y % 100 == 0) ? "0" : "1") : "0");
	}
}
