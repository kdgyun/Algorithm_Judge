package 단계별로_풀어보기.B_11_정렬;

/**
 * BOJ 1181 : 단어 정렬
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
 
 
public class BOJ_1181 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		String[] arr = new String[N];
 
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
		StringBuilder sb = new StringBuilder();
 
		sb.append(arr[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
 
}
