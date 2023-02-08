package 기타문제;

/**
 * BOJ 10039 : 평균 점수
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_10039 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int val = Integer.parseInt(br.readLine());

			sum += val > 40 ? val : 40;

			/*
			 * if(val > 40) { 
			 * 		sum += val; 
			 * } 
			 * else { 
			 * 		sum += 40; 
			 * }
			 */
		}
		System.out.println(sum / 5);
	}

}