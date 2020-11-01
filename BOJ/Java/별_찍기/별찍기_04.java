package 별_찍기;

/**
 * BOJ 2441 : 별 찍기 - 4
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 별찍기_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, j, k;

		for (i = 0; i < N; i++) {
			for (k = 0; k < i; k++) {
				bw.write(" ");
			}
			for (j = N; j > i; j--) {
				bw.write("*");
			}

			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

}
