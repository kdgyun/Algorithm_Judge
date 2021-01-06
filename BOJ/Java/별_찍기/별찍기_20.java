package 별_찍기;

/**
 * BOJ 10995 : 별 찍기 - 20    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_20 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb1 = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb1.append("* ");
		}
		
		final String s1 = sb1.toString();
		
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < N; i++) {
			
			sb2.append(" *");
			
		}
		
		final String s2 = sb2.toString();
		
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				sb.append(s1);
			}
			else {
				sb.append(s2);
			}
			sb.append('\n');
		}
		
		
		System.out.println(sb);
	}
}
