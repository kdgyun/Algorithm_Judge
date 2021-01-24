package 단계별로_풀어보기.B_08_수학1;

/**
 * BOJ 10757 : 큰 수 A+B 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String first = st.nextToken();
		String second = st.nextToken();
		
		int maxLen = Math.max(first.length(), second.length());
		
		
		int[] f = new int[maxLen + 1];
		int[] s = new int[maxLen + 1];
		
		int idx = 0;
		for(int i = first.length() - 1; i >= 0; i--) {
			f[idx++] = first.charAt(i) - '0';
		}
		
		idx = 0;
		for(int i = second.length() - 1; i >= 0; i--) {
			s[idx++] = second.charAt(i) - '0';
		}
		
		
		for(int i = 0; i < maxLen; i++) {
			int value = f[i] + s[i];
			
			f[i] = value % 10;
			f[i + 1] += (value / 10);
		}
		
		StringBuilder sb = new StringBuilder();
		if(f[f.length - 1] != 0) {
			sb.append(f[f.length - 1]);
		}
		
		for(int i = f.length - 2; i >= 0; i--) {
			sb.append(f[i]);
		}
		System.out.println(sb);
	}
}


