package B_03_for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_11022 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
		String str;

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			A = str.charAt(0) - '0';
			B = str.charAt(2) - '0';
			sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A + B)
					.append('\n');
		}
		System.out.print(sb);
	}
}
