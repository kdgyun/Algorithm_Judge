package 단계별로_풀어보기.B_20_스택;

/**
 * BOJ 9012 : 괄호    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine());
 
		while (T-- > 0) {
			sb.append(solve(br.readLine())).append('\n');
		}
		System.out.println(sb);
 
	}
 
	public static String solve(String s) {
 
		int count = 0;
 
		for (char c : s.toCharArray()) {

			if (c == '(') {
				count++;
			}
 
			else if (count == 0) {
				return "NO";
			}

			else {
				count--;
			}
		}
		if (count == 0) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}
