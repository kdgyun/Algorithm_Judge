package 기타문제;

/**
 * BOJ 2577 : 숫자의 개수
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];

		while (val != 0) {
			arr[val % 10]++;
			val /= 10;
		}

		for (int result : arr) {
			System.out.println(result);
		}
	}
}
