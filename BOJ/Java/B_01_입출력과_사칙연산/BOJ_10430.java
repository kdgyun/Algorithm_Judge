package B_01_입출력과_사칙연산;

import java.util.Scanner;

public class BOJ_10430 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double A = in.nextInt();
		double B = in.nextInt();
		double C = in.nextInt();

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
		in.close();
	}

}
