package 단계별로_풀어보기.B_10_정렬;

/**
 * BOJ 18870 : 좌표 압축
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
import java.util.HashMap;
import java.util.Arrays;


public class BOJ_18870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] origin = new int[N];	// 원본 배열
		int[] sorted = new int[N];	// 정렬 할 배열
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap

		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			// 정렬할 배열과 원본 배열에 값을 넣어준다.
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		// 정렬 할 배열에 대해 정렬을 수행해준다.
		Arrays.sort(sorted);
		
		
		// 정렬 된 배열을 순회하면서 map에 넣어준다.
		int rank = 0;
		int last = sorted[0];
		rankingMap.put(last, rank++);
		for(int i = 1, v; i < N; i++) {
			/*
			 *  이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
			 *  중복되면 안되므로, 원소가 중복되지 않을 때만
			 *  map에 원소와 그에 대응되는 순위를 넣어준다.
			 */
			if(last != (v = sorted[i])) {
				rankingMap.put(last = v, rank++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}
}
