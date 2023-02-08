package 단계별로_풀어보기.B_23_이분_탐색;

/**
 * BOJ 2805 : 나무 자르기      
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

public class BOJ_2805 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		// upper bound
		while(min < max) {
			
			int mid = (min + max) >>> 1;
			long sum = 0;
			for(int treeHeight : tree) {
				
				if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}

			if(sum < M) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}
