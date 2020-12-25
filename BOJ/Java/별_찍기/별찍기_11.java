package 별_찍기;

/**
 * BOJ 2448 : 별 찍기 - 11 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class 별찍기_11 {

	static char[][] star;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		star = new char[N][2 * N - 1]; 
		
		for (int i = 0; i < N; i++) {
			Arrays.fill(star[i], ' ');
		}
		
		rec(0, N - 1, N);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(star[i]).append('\n');
		}

		System.out.println(sb);

	}

	static void rec(int x, int y, int n) {
		if (n == 3) {
			star[x][y] = '*';
			star[x + 1][y - 1] = star[x + 1][y + 1] = '*'; 
			star[x + 2][y - 2] = star[x + 2][y - 1] = star[x + 2][y] = star[x + 2][y + 1] = star[x + 2][y + 2] = '*'; 
			return;
		}

		int temp = n >> 1;
		rec(x, y, temp);
		rec(x + temp, y - temp, temp);
		rec(x + temp , y + temp, temp);
	}
}
