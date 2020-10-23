package B_03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8393 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
        
		int sum = (N + 1) * (N >>> 1);
		
		if(N % 2 != 0) {
			sum += (N >>> 1) + 1; 
		}
		System.out.println(sum);
        

	}
}
