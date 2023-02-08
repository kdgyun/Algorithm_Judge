package 단계별로_풀어보기.B_20_스택;

/**
 * BOJ 1874 : 스택 수열    
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_1874 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] stack = new int[N];
		
		int idx = 0;
		int start = 0;
		
		
		while(N -- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
		
				for(int i = start + 1; i <= value; i++) {
					stack[idx] = i;
					idx++;
					sb.append('+').append('\n');
				}
				start = value; 	 
			}
			
			else if(stack[idx - 1] != value) {
					System.out.println("NO");
					System.exit(0);	 
			}
			
			idx--;
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}

}
