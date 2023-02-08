package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 1037 : 약수  
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
 
public class BOJ_1037 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		while(T-- > 0) {
			int N = Integer.parseInt(st.nextToken());
			max = N > max ? N : max;
			min = N < min ? N : min;
		}
		System.out.println(max * min);
	}
 
}