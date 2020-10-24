package B_03_for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}

}
