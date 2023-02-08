package 단계별로_풀어보기.B_15_정수론_및_조합론;

/**
 * BOJ 9375 : 패션왕 신해빈    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class BOJ_9375 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스 
 
		while (T -- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>
			
			int N = Integer.parseInt(br.readLine());	// 입력받는 옷의 개수
			
			while (N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				st.nextToken();	// 옷 이름은 필요 없음 
				
				String kind = st.nextToken();	// 옷 종류 
 
				/**
				 * 해당 종류의 옷이 해시맵에 있을경우
				 * 해시맵에 저장되어있던 해당 종류의 개수를 +1 증가시킨다.
				 *
				 * 해당 종류의 옷이 해시맵에 없을 경우
				 * 해당 종류와 개수 1을 넣는다.
				 */
				
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
 
			int result = 1;
 
			/**
			 * 안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해준 값을
			 * 곱해주어야 한다.
			 */
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.
			sb.append(result - 1).append('\n');
 
		}
		System.out.println(sb);
	}
 
}