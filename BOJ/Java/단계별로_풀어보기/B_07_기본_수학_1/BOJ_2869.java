package 단계별로_풀어보기.B_07_기본_수학_1;

/**
 * BOJ 2869 : 달팽이는 올라가고 싶다 
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

public class BOJ_2869 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());

		int day = (length - down) / (up - down);
		
		if ((length - down) % (up - down) != 0)
			day++;

		System.out.println(day);
	}
}
