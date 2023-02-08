package 단계별로_풀어보기.B_22_분할_정복;


/**
 * BOJ 2740 : 행렬 곱셈      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2740 {
	
	private static final int threshold = 16;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 행렬 A
		int[][] A = new int[128][128];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		// 행렬 B 입력
		int[][] B = new int[128][128];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < K; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		/*
		 * 2^n꼴의 정사각 행렬로 패딩해야 하기 때문에 패딩 된 사이즈를 구해야한다.
		 * 즉, N과 K, M중 가장 큰 값을 기준으로 해당 값보다 크면서
		 * 2^n에 가장 가까운 값을 얻어야 한다.
		 */
		int big = Math.max(Math.max(N, K), M);

		int size = 1;
		while(true) {
			if(size >= big) {
				break;
			}
			size *= 2;
		}

		
		// 분할정복 메소드 호출
		int[][] C = multiply(A, B, size);

		StringBuilder sb = new StringBuilder();

		// 출
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				sb.append(C[i][j] + " ");
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
	
	// 행렬 loop 곱 메소드
	public static int[][] loopMultiply(int[][] A, int[][] B, int size) {

		int res[][] = new int[size][size];
		
		int r;
		for (int k = 0; k < size; k++) {
			for (int i = 0; i < size; i++) {
				
				// A(ik) 원소를 고정시켜두고, 그에 대한 B의 k열을 고정시켜 j행을 움직이면서 연산한다.
				r = A[i][k];			
				for (int j = 0; j < size; j++) {
					res[i][j] += r * B[k][j];
				}
			}
		}
		return res;
	}
	


	public static int[][] multiply(int[][] A, int[][] B, int size) {


		int[][] C = new int[size][size];	// 완성시킬 C 배열
	    
		// size가 1로 가장 작게 쪼개질 경우 (0,0) 원소밖에 없으므로 해당 원소의 곱을 반환
		if (size == 1) {
			C[0][0] = A[0][0] * B[0][0];
			return C;
		}
		
		if (size <= threshold) {	// 임계값 이하가 되면 loop로 곱셈을 하여 반환한다.
			return C = loopMultiply(A, B, size);
		}


		int newSize = size / 2;	// 부분행렬에 대한 사이즈

		// A의 부분행렬
		int[][] a11 = subArray(A, 0, 0, newSize);
		int[][] a12 = subArray(A, 0, newSize, newSize);
		int[][] a21 = subArray(A, newSize, 0, newSize);
		int[][] a22 = subArray(A,newSize, newSize, newSize);

		// A의 부분행렬
		int[][] b11 = subArray(B, 0, 0, newSize);
		int[][] b12 = subArray(B, 0, newSize, newSize);
		int[][] b21 = subArray(B, newSize, 0, newSize);
		int[][] b22 = subArray(B, newSize, newSize, newSize);


	
		// M1 := (A11 + A22) * (B11 + B22)
		int[][] M1 = multiply(add(a11, a22, newSize), add(b11, b22, newSize), newSize);

		// M2 := (A21 + A22) * B11
		int[][] M2 = multiply(add(a21, a22, newSize), b11, newSize);

		// M3 := A11 * (B12 - B22)
		int[][] M3 = multiply(a11, sub(b12, b22, newSize), newSize);

		// M4 := A22  * (B21 − B11)
		int[][] M4 = multiply(a22, sub(b21, b11, newSize), newSize);

		// M5 := (A11 + A12) * B22
		int[][] M5 = multiply(add(a11, a12, newSize), b22, newSize);

		// M6 := (A21 - A11) * (B11 + B12)
		int[][] M6 = multiply(sub(a21, a11, newSize), add(b11, b12, newSize), newSize);

		// M7 := (A12 - A22) * (B21−B22)
		int[][] M7 = multiply(sub(a12, a22, newSize), add(b21, b22, newSize), newSize);

		
		
		// C11 := M1 + M4 − M5 + M7
		int[][] c11 = add(sub(add(M1, M4, newSize), M5, newSize), M7, newSize);

		// C12 := M3 + M5
		int[][] c12 = add(M3, M5, newSize);

		// C21 := M2 + M4
		int[][] c21 = add(M2, M4, newSize);

		// C22 := M1 − M2 + M3 + M6
		int[][] c22 = add(add(sub(M1, M2, newSize), M3, newSize), M6, newSize);


		// 구해진 C의 부분행렬들 합치기
		merge(c11, C, 0, 0, newSize);
		merge(c12, C, 0, newSize, newSize);
		merge(c21, C, newSize, 0, newSize);
		merge(c22, C, newSize, newSize, newSize);


		return C;
	}

	// 행렬 뺄셈
	public static int[][] sub(int[][] A, int[][] B, int size) {

		int[][] C = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				C[i][j] = A[i][j] - B[i][j];
			}
		}
		return C;
	}

	// 행렬 덧셈
	public static int[][] add(int[][] A, int[][] B, int size) {

		int n = size;

		int[][] C = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	

	// 부분행렬을 반환하는 메소드
	public static int[][] subArray(int[][] src, int row, int col, int size) {

		int[][] dest = new int[size][size];
		for (int dset_i = 0, src_i = row; dset_i < size; dset_i++, src_i++) {
			for (int dest_j = 0, src_j = col; dest_j < size; dest_j++, src_j++) {
				dest[dset_i][dest_j] = src[src_i][src_j];
			}
		}
		return dest;
	}

	// src는 복사할 배열(=부분배열), dest는 합쳐질 배열(= 배열 C) 
	public static void merge(int[][] src, int[][] dest, int row, int col, int size) {

		for (int src_i = 0, dest_i = row; src_i < size; src_i++, dest_i++) {
			for (int src_j = 0, dest_j = col; src_j < size; src_j++, dest_j++) {

				dest[dest_i][dest_j] = src[src_i][src_j];
			}
		}
	}

}
