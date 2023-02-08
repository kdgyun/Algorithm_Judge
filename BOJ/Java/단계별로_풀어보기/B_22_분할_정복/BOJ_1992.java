package 단계별로_풀어보기.B_22_분할_정복;

/**
 * BOJ 1992 : 쿼드트리      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1992 {
	
	public static char[][] img;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		img = new char[N][N];
		
		for(int i = 0; i < N; i++) {
			img[i] = br.readLine().toCharArray();
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
	}
	
	public static void QuadTree(int x, int y, int size) {
		
		if(isPossible(x, y, size)) {
			sb.append(img[x][y]);
			return;
		}
		
		int newSize = size >>> 1;
		
		sb.append('('); 
		
		QuadTree(x, y, newSize);
		QuadTree(x, y + newSize, newSize);
		QuadTree(x + newSize, y, newSize);
		QuadTree(x + newSize, y + newSize, newSize);
		
		sb.append(')');
			
		
	}
	
	
	public static boolean isPossible(int x, int y, int size) {
		char value = img[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
