package 단계별로_풀어보기.B_08_기본_수학_2;

/**
 * BOJ 1978 : 소수 찾기
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

public class BOJ_1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			boolean TF = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					TF = false;
					break;
				}
			}
			if(TF) {
				count++;
			}
		}
		System.out.println(count);
	}

}

