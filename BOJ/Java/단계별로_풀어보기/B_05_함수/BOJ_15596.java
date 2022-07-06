package 단계별로_풀어보기.B_05_함수;


/**
 * BOJ 15596 : 정수 N개의 합 
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


/*
  <제출할 경우 클래스 명을 반드시 Test로 바꾸어야 함>
  
  문제 제출 조건 
 
  Java: long sum(int[] a); (클래스 이름: Test)
  a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
  리턴값: a에 포함되어 있는 정수 n개의 합
 */


public class BOJ_15596 {
	
	long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
