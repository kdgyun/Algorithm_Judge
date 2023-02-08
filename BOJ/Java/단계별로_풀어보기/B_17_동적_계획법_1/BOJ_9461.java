package 단계별로_풀어보기.B_17_동적_계획법_1;

/**
 * BOJ 9461 : 파도반 수열  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_9461 {
 
	static long[] seq = new long[101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		padovan();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			sb.append(seq[Integer.parseInt(br.readLine())]).append('\n');
		}
		
		System.out.println(sb);
	}
 
	public static void padovan() {
		
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 1;
 
		for (int i = 4; i < 101; i++) {
			seq[i] = seq[i - 2] + seq[i - 3];
		}
	}
 
}
