package 단계별로_풀어보기.B_06_문자열;

/**
 * BOJ 1152 : 단어의 개수
 * 
 * @author kdgyun 
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.IOException;

public class BOJ_1152 {
	public static void main(String[] args) throws IOException {

		int count = 0;
		int pre_str = 32;
		int str;

		while (true) {
			str = System.in.read();
			if (str == 32) {
				if (pre_str != 32)
					count++;
			} else if (str == 10) {
				if (pre_str != 32)
					count++;
				break;
			}

			pre_str = str;

		}

		System.out.println(count);
	}
}
