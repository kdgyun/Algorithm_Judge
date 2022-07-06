package 단계별로_풀어보기.B_03_반복문;

/**
 * BOJ 15552 : 빠른 A+B
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ_15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		String str;
		
		int split;
		while(T --> 0) {
			str = br.readLine();
			split = str.indexOf(" ");
			
			bw.write(Integer.parseInt(str.substring(0, split)) + Integer.parseInt(str.substring(split + 1)) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
