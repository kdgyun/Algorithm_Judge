package 단계별로_풀어보기.B_22_분할_정복;


/**
 * BOJ 6549 : 히스토그램에서 가장 큰 직사각형      
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 * using Stack
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_6549 {
	
	public static int[] histogram;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int N;
		while(true) {

			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			
			if(N == 0) {
				break;
			}
			histogram = new int[N];
			for(int i = 0; i < N; i++) {
				histogram[i] = Integer.parseInt(st.nextToken());
			}
			
			/*
			 * If you want to use the divide and conquer method,
			 * replace it as follows.
			 * getArea(N) -> getArea(0, N-1)
			 */
			sb.append(getArea(N)).append('\n');	
			histogram = null;
			
		}
		System.out.println(sb);
	}
	
	public static long getArea(int len) {
		
		int[] stack = new int[len];
		int sSize = 0;
		int top = -1;
		
		long maxArea = 0;
		
		for(int i = 0; i < len; i++) {
			
			/*
			 *  이전 체인의 높이보다 현재 히스토그램 높이가 작거나 같을경우
			 *  i번째 막대보다 작은 이전 체인들을 pop하면서 최대 넓이를 구해준다.
			 *  
			 */
			while(sSize > 0 && histogram[stack[top]] >= histogram[i]) {
				int height = histogram[stack[top--]];	// 이전 체인의 높이
				sSize--;
				/*
				 * pop한 뒤 그 다음의 이전체인이 만약 없다면 0번째 index 부터 (i-1)번째 인덱스까지가
				 * 유일한 폭이 된다. (폭은 i가 됨)
				 * 반면 스택이 비어있지 않다면 이는 pop한 높이보다 더 작은 높이를 갖는
				 * 체인이 들어있다는 것이므로 (i-1)번째 index에서 그 다음 이전 체인의 index를 
				 * 빼준 것이 폭이 된다.
				 */
				long width = sSize == 0 ? i : i - 1 - stack[top]; 
				
				maxArea = Math.max(maxArea, height * width);	// 최대 넓이 값 갱신
			}
			
			/*
			 *  위 과정이 끝나면 스택에 저장되어있는 체인은 모두 i보다 작거나 같은
			 *  체인들 뿐이므로 i번째 index를 넣어준다.
			 */

			stack[++top] = i;
			sSize++;

		}
		
		// 위 과정이 끝나고 Stack에 남아있는 체인들이 존재할 수 있으므로 나머지도 위와같은 과정을 거친다.
        while(sSize > 0) {
            int height = histogram[stack[top--]];
            sSize--;
            /*
             * 만약 pop하고 난 뒤 스택이 비어있다면 이는 남아있는 체인이 없다는 뜻이고
             * 고로 0 ~ (len - 1) 까지인 전체 폭이 width가 되는 것이다. 
             */
            long width = sSize == 0 ? len: len - 1 - stack[top];
            maxArea = Math.max(maxArea, width * height);
        }
		
        return maxArea;
		
	}
	
	
	
	
	// divid and conquer 	
	public static long getArea(int lo, int hi) {
		
		// 막대 폭이 1일경우
		if(lo == hi) {
			return histogram[lo];
		}
		
		// [1번 과정]
		int mid = (lo + hi) / 2;	// 중간지점
		
		/*
		 *  [2번 과정]
		 *  mid를 기점으로 양쪽으로 나누어 양쪽 구간 중 큰 넓이를 저장
		 *  왼쪽 부분 : lo ~ mid
		 *  오른쪽 부분 : mid + 1 ~ hi 
		 */
		long leftArea = getArea(lo, mid);
		long rightArea = getArea(mid + 1, hi);
		
		// [3번 과정]
		long max = Math.max(leftArea, rightArea);
		
		// 양쪽 구간 중 큰 값과 중간 구간을 비교하여 더 큰 넓이로 갱신
		max = Math.max(max, getMidArea(lo, hi, mid));

		return max;
		
	}
	
	// 중간지점 영역의 넓이를 구하는 메소드
	public static long getMidArea(int lo, int hi, int mid) {
		
		int toLeft = mid;	// 중간 지점으로부터 왼쪽으로 갈 변수
		int toRight = mid;	// 중간 지점으로부터 오른쪽으로 갈 변수
		
		long height = histogram[mid];	// 높이
		
		// [초기 넓이 (구간 폭이 1이므로 넓이는 높이가 면적이 됨)
		long maxArea = height;
		
		
		// 양 끝 범위를 벗어나기 전까지 반복
		while(lo < toLeft && toRight < hi) {
			
			/*
			 *  양쪽 다음칸의 높이 중 높은 값을 선택하되, 
			 *  갱신되는 height는 기존 height보다 작거나 같아야 한다.
			 */
			if(histogram[toLeft - 1] < histogram[toRight + 1]) {
				toRight++;
				height = Math.min(height, histogram[toRight]);	
			}
			else {
				toLeft--;
				height = Math.min(height, histogram[toLeft]);
			}

			// 최대 넓이 갱신
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		
		// 오른쪽 구간을 끝까지 탐색 못했다면 마저 탐색한다.
		while(toRight < hi) {
			toRight++;
			height = Math.min(height, histogram[toRight]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		// 왼쪽 구간을 끝까지 탐색 못했다면 마저 탐색한다.
		while(lo < toLeft) {
			toLeft--;
			height = Math.min(height, histogram[toLeft]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		return maxArea;
	}

	 
}
