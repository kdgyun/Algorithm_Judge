package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 10809 : 문자열 반복
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());        

		for (int i = 0; i < T; i++) {

			String[] str = br.readLine().split(" ");

			int R = Integer.parseInt(str[0]);

			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
