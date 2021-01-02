package 별_찍기;


/**
 * BOJ 10994 : 별 찍기 - 19
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

public class 별찍기_19 {

	static char[][] map;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		map = new char[ 4 * (N - 1) + 1][ 4 * (N - 1) + 1];
		for(int i = 0; i < 4 * (N - 1) + 1; i++) {
			Arrays.fill(map[i], ' ');
		}
		
		rec(0, 0, N);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <  4 * (N - 1) + 1; i++) {
			sb.append(map[i]);
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	static void rec(int x, int y, int depth) {
		if(depth == 1) {
			map[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 4 * (depth - 1) + 1; i++) {
			
			if(i == 0 || i == 4 * (depth - 1)) {
				for(int j = 0; j < 4 * (depth - 1) + 1; j++) {
					map[x + i][y + j] = '*';
				}
				continue;
			}
			
			map[x + i][y] = '*';
			map[x + i][y + 4 * (depth - 1)] = '*';
		}
			
		rec(x + 2, y + 2, depth - 1);
		
		
	}
}
