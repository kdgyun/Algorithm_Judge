package 단계별로_풀어보기.B_05_함수;

/**
 * BOJ 4673 : 셀프 넘버
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

public class BOJ_4673 {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];

		for (int i = 1; i <= 10001; i++) {
			int n = d(i);
			if (n < 10001)
				check[n] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) // 생성자가 없으면
				sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

	public static int d(int number) {
		
		int sum = number;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
