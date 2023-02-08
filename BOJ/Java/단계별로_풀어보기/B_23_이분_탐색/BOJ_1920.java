package 단계별로_풀어보기.B_23_이분_탐색;


/**
 * BOJ 1920 : 수 찾기      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
	
	private static int[] arr;
	private static int N;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int binarySearch(int key) {
		
		int lo = 0;
		int hi = N - 1;
		
		int mid;
		
		while(lo <= hi) {
			
			mid = (lo + hi) >>> 1;
			int midValue = arr[mid];
			
			if(key < midValue) {
				hi = mid - 1;
			}
			else if(key > midValue) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
