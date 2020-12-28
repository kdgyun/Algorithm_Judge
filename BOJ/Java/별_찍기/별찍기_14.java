package 별_찍기;

/**
 * BOJ 2556 : 별 찍기 - 14  
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 별찍기_14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder a = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			a.append('*');
		}
		a.append('\n');
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(a.toString());
		}
		System.out.print(sb);
	}

}


