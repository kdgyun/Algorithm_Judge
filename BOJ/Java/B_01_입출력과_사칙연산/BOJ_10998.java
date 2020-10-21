package B_01_입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10998 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = br.read() - '0';
		br.read();
		int b = br.read() - '0';
		System.out.println(a * b);

	}
}
