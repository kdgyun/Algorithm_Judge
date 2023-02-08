package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 5086 : 배수와 약수  
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

public class BOJ_5086 {
	public static void main(String[] args) throws IOException {
		 
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
 
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
			
		}
		System.out.println(sb);
	}
 
}
