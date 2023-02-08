package 기타문제;

/**
 * BOJ 2261 : 가장 가까운 두 점     
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
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class BOJ_2261 {

	private static Point[] p;
	
	private static class Point {	// 좌표 클래스
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	// 두 Point의 거리를 반환하는 메소드
	private static int dist(Point o1, Point o2) {
		return (o1.x - o2.x) * (o1.x - o2.x) + (o1.y - o2.y) * (o1.y - o2.y);
	}
	
	private static Comparator<Point> Xcomp = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			return o1.x - o2.x;
		}
	};
	
	/*
	 * 분할정복과는 달리 모든 x, y가 같은 경우
	 * 중복 포인트를 없애기 위해 y가 같다면 x값에 대해서도
	 * 비교를 해주도록 해야한다.
	 */
	private static Comparator<Point> Ycomp = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			if(o1.y == o2.y) {
				return o1.x - o2.x;
			}
			return o1.y - o2.y;
		}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		p = new Point[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
		}
		
		// X축에 대해 p배열을 정렬한다.
		Arrays.sort(p, Xcomp);
		
		// x축에 대한 후보군들을 넣을 set이며 해당 후보군들은 y축에 대해 정렬된다. 
		TreeSet<Point> set = new TreeSet<Point>(Ycomp);
		
		/*
		 * 첫 번째 Point와 두 번째 Point를 최소거리라고 가정하고
		 * 시작한다.
		 */
		int minDist = dist(p[0], p[1]);
		int sqrtMinDist = (int)Math.sqrt(minDist) + 1;
		
		// 탐색은 p[2]부터 시작하므로 p[0], p[1]을 후보군이라 가정하고 TreeSet에 넣는다.
		set.add(p[0]);
		set.add(p[1]);
		
		int lowestIdx = 0;	// 왼쪽 끝점
		for(int i = 2; i < N; i++) {
			
			Point benchPoint = p[i];
			
			/*
			 * [밝은 회색 영역 후보군 필터링]
			 * 
			 * 왼쪽 끝점부터 p[i] 이전 원소들에 대하여 midDist보다 
			 * 멀리 떨어진 원소들은 제외한다.
			 */
			while(lowestIdx < i) {
				Point targetPoint = p[lowestIdx];
				
				int xDist = benchPoint.x - targetPoint.x;
				
				/*
				 *  x좌표에 대해 minDist보다 크면 후보군에서 제외한다.
				 *  
				 *  한 번 제외된 원소는 다시 후보군이 될 일이 없으므로
				 *  왼쪽 끝점을 한 칸 이동시킨다.
				 */

				if(xDist > sqrtMinDist) {
					set.remove(targetPoint);
					lowestIdx++;
				}
				
				/*
				 * x축에 대해 정렬된 상태이기 때문에
				 * 처음 만족하는 후보군을 마주치면 이 후의 후보군들은
				 * x축에 대해 모두 만족하므로 break한다.
				 */
				else {
					break;
				}
			}
			
			/*
			 * [진한 회색 영역 후보군 필터링]
			 * 
			 * p[(-100000, 기준점 - root(minDist)) : 100000, 기준점 + root(minDist)] 사이에 있는
			 * 원소들에 대해 subTree를 얻고, 해당 원소들에 대해 기준점과의 거리를 측정한다.
			 */
			
			
			for(Point v : set.subSet(new Point(-100000, benchPoint.y - sqrtMinDist), new Point(100000, benchPoint.y + sqrtMinDist))) {
				minDist = Math.min(minDist, dist(benchPoint, v));
			}
			
			sqrtMinDist = (int)Math.sqrt(minDist) + 1;
			set.add(benchPoint);

		}
		
		System.out.println(minDist);
		
		
	}
	
	

}
