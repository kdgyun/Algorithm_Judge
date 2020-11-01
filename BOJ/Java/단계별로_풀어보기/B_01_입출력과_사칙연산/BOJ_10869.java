package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 10869 : 사칙연산
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.util.Scanner;

public class BOJ_10869 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String e = in.next();
		System.out.println(e);
		String aa = in.nextLine();

		System.out.println(aa);
		int A = in.nextInt();
		int B = in.nextInt();

		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

		in.close();

	}

}
