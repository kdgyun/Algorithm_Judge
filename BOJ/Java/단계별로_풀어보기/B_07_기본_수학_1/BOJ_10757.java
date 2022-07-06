package 단계별로_풀어보기.B_07_기본_수학_1;

/**
 * BOJ 10757 : 큰 수 A+B 
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

/*
 * 이 문제의 경우 BigInteger을 쓰면 간단히 해결 할 수도 있으나,
 * 여기서는 직접 연산과정을 구현하도록 함.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str_A = st.nextToken();
		String str_B = st.nextToken();
		
		// 두 개의 수 중 가장 긴 자리수 길이를 구해둠
		int max_length = Math.max(str_A.length(), str_B.length());
		
		
		int[] A = new int[max_length + 1];	// 마지막 자리수 올림이 있을 수 있으므로 +1
		int[] B = new int[max_length + 1];	// 마지막 자리수 올림이 있을 수 있으므로 +1
		
		// A 초기화 
		for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = str_A.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		// B 초기화
		for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = str_B.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		
		for(int i = 0; i < max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;		// 더한 값의 10으로 나눈 나머지가 자리값이 됨
			A[i + 1] += (value / 10);	// 더한 값의 10으로 나눈 몫이 올림값이 됨
		}
		
		// A배열 역순 출력
		// 가장 높은 자리수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0) {
			sb.append(A[max_length]);
		}
		
		for(int i = max_length - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		System.out.println(sb);
	}
}


