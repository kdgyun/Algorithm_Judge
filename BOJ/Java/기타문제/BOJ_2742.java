package 기타문제;

/**
 * BOJ 2742 : 기찍 N
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
        
		StringBuilder sb = new StringBuilder();
        
		while(N > 0) {
			sb.append(N--).append('\n');

		}
		System.out.println(sb);
	}
}
