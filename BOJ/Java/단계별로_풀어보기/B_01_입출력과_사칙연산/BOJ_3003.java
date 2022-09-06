package 단계별로_풀어보기.B_01_입출력과_사칙연산;

/**
 * BOJ 3003 : 킹, 퀸, 룩, 비숍, 나이트, 폰
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

public class BOJ_3003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.print(king - Integer.parseInt(st.nextToken()) + " ");
		System.out.print(queen - Integer.parseInt(st.nextToken()) + " ");
		System.out.print(rook - Integer.parseInt(st.nextToken()) + " ");
		System.out.print(bishop - Integer.parseInt(st.nextToken()) + " ");
		System.out.print(knight - Integer.parseInt(st.nextToken()) + " ");
		System.out.print(pawn - Integer.parseInt(st.nextToken()) + " ");		
		
	}
}
