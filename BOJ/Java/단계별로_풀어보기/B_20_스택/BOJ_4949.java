package 단계별로_풀어보기.B_20_스택;

/**
 * BOJ 4949 : 균형잡힌 세상    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
 
		while (true) {
 
			s = br.readLine();
 
			if (s.equals(".")) {
				break;
			}
 
			sb.append(solve(s)).append('\n');
		}
 
		System.out.println(sb);
	}
 
	public static String solve(String s) {
		
		char[] stack = new char[s.length()];
		int size = 0;
 
		for (char val : s.toCharArray()) {

			if (val == '(' || val == '[') {
				stack[size] = val;
				size++;
			} 
			else if (val == ')') {
				if (size == 0 || stack[size - 1] != '(') {
					return "no";
				} 
				else {
					size--;
				}
			} 
			else if (val == ']') {
				if (size == 0 || stack[size - 1] != '[') {
					return "no";
				} 
				else {
					size--;
				}
			}
		}
		
		if (size != 0) {
			return "no";
		} 
		else {
			return "yes";
		}
	}
}
