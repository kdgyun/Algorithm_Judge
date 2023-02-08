package 기타문제;

/**
 * BOJ 17298 : 오큰수    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17298 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
		int[] stack = new int[N]; 
		int top = -1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		

		for (int i = 0; i < N; i++) {
			while (top != - 1 && seq[stack[top]] < seq[i]) {
				seq[stack[top--]] = seq[i];
			}
			stack[++top] = i;
		}
		
		for(int i = top; i >= 0; i--) {
			seq[stack[i]] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int v : seq) {
			sb.append(v).append(' ');
		}

		System.out.println(sb);
	}
}
