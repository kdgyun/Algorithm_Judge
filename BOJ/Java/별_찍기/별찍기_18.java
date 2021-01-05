package 별_찍기;

/**
 * BOJ 10993 : 별 찍기 - 18
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

public class 별찍기_18 {

	private static char[][] star;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int h = (1 << N) - 1;
		int w = 2 * h - 1;

		star = new char[h][w];

		for (int i = 0; i < h; i++) {
			Arrays.fill(star[i], ' ');
		}

		if (N % 2 == 0) {
			make(N, h - 1, h - 1, true);
		} else {
			make(N, 0, h - 1, false);
		}

		StringBuilder sb = new StringBuilder();

		if (N % 2 == 0) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					sb.append(star[i][j]);
				}
				sb.append('\n');
				w--;
			}
		} else {
			int ww = (1 << N) - 1;
			for (int i = 0; i < h; i++, ww++) {
				for (int j = 0; j < ww; j++) {
					sb.append(star[i][j]);
				}
				sb.append('\n');
			}
		}

		System.out.println(sb);

	}

	private static void make(int n, int x, int y, boolean up) {
		star[x][y] = '*';

		if (n == 1) {
			return;
		}

		int h = (1 << n) - 1;
		int left = y;
		int right = y;

		for (int i = 1; i < h; i++) {
			if (up) {
				x--;
			} else {
				x++;
			}

			star[x][--left] = '*';
			star[x][++right] = '*';
		}

		for (int i = left + 1; i < right; i++) {
			star[x][i] = '*';
		}

		if (up) {
			x++;
		} 
		else {
			x--;
		}

		make(n - 1, x, y, !up);

	}
}
