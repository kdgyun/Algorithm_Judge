package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 10818 : 최소, 최대 
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

public class BOJ_10818 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(N --> 0) {
			int val = Integer.parseInt(st.nextToken());
			
			max = max > val ? max : val;
			min = min < val ? min : val;
		}
		
		System.out.println(min + " " + max);
	}
}

