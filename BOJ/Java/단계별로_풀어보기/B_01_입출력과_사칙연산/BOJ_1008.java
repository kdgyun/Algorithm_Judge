package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 1008 : A/B
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BOJ_1008 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		System.out.println(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));
		;

	}

}
