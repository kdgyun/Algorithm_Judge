package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 4344 : 평균은 넘겠지
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

public class BOJ_4344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr;
		int sum;
		double mean, count;

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {

			st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력

			int N = Integer.parseInt(st.nextToken()); // 학생 수
			arr = new int[N];

			sum = 0; // 성적 누적 합 변수

			// 성적 입력부분
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken()); // 성적 저장
				sum += arr[j]; // 성적 누적 합
			}

			mean = (double) sum / N;
			count = 0; // 평균 넘는 학생 수 변수

			// 평균 넘는 학생 비율 찾기
			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			sb.append(String.format("%.3f", (count / N) * 100)).append('%').append('\n');

		}
		System.out.println(sb);
	}

}
