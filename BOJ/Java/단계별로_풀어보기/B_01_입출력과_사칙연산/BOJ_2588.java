package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 2588 : 곱셈
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());


		StringBuilder sb = new StringBuilder();
		sb.append(A * (B % 10));
		sb.append('\n');
		sb.append(A * ((B % 100) / 10));
		sb.append('\n');
		sb.append(A * (B / 100));
		sb.append('\n');
		sb.append(A * B);

		System.out.print(sb);

	}

}

