package 별_찍기;

/**
 * BOJ 2440 : 별 찍기 - 3
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class 별찍기_03 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		byte a = Byte.parseByte(br.readLine());
		byte i, j;
		for (i = a; i > 0; i--) {
			for (j = 0; j < i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
