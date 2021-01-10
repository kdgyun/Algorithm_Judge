package 별_찍기;

/**
 * BOJ 10997 : 별 찍기 - 22  
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

public class 별찍기_22 {

	static char[][] star;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		if (N == 1) {
			System.out.println('*');
			System.exit(0);
		}
		int w = (N << 2) - 3;
		int h = w + 2;

		star = new char[h][w];

		for (int i = 0; i < h; i++) {
			Arrays.fill(star[i], ' ');
		}

		make(0, w - 1, N);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < h; i++) {
			if (i == 1) {
				sb.append("*\n");
				continue;
			}
			for (int j = 0; j < w; j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);

	}

	static void make(int x, int y, int N) {

		int w = 4 * N - 3;
		int h = w + 2;
		
		int ww = y;
		int hh = x;

		for (int i = 1; i < w; i++)
			star[hh][ww--] = '*';
		for (int i = 1; i < h; i++)
			star[hh++][ww] = '*';
		for (int i = 1; i < w; i++)
			star[hh][ww++] = '*';
		for (int i = 1; i < h - 2; i++)
			star[hh--][ww] = '*';

		star[hh][ww--] = '*';
		star[hh][ww--] = '*';
		
		if (N == 2) {
			star[hh++][ww] = '*';
			star[hh++][ww] = '*';
			star[hh][ww] = '*';
			return;
		}

		make(hh, ww, N - 1);
	}
}
