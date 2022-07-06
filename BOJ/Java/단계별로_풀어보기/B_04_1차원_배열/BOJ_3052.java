package 단계별로_풀어보기.B_04_1차원_배열;

/**
 * BOJ 3052 : 나머지
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] set = new boolean[42];
		
		for (int i = 0; i < 10; i++) {
			set[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		
		for(int i = 0; i < 42; i++) {
			if(set[i]) count++;
		}
		
		System.out.println(count);
	}
}


/* or useing hashset solution
  
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class BOJ_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		int count = 0;

		System.out.println(set.size());
	}
}

 */
