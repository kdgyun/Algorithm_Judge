package 단계별로_풀어보기.B_22_분할_정복;

/**
 * BOJ 2630 : 색종이 만들기      
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


public class BOJ_2630 {
	
	public static int white = 0;
	public static int blue = 0;
	public static int[][] board;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		board = new int[N][N];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void partition(int row, int col, int size) {
		
		if(colorCheck(row, col, size)) {
			if(board[row][col] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		
		int newSize = size / 2;
		partition(row, col, newSize);						
		partition(row, col + newSize, newSize);			
		partition(row + newSize, col, newSize);		
		partition(row + newSize, col + newSize, newSize);	
	}
	
	
	public static boolean colorCheck(int row, int col, int size) {
	
		int color = board[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(board[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
