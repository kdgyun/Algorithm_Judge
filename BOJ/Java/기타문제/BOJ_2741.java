package 기타문제;

/**
 * BOJ 2741 : N 찍기
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
        
		int i = 1;
		StringBuilder sb = new StringBuilder();
        
		while(i<= N) {
			sb.append(i).append('\n');
			i++;
		}
		System.out.print(sb);
	}
}
