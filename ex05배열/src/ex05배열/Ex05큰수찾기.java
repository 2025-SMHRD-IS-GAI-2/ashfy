package ex05배열;

import java.util.Arrays;
import java.util.Random;

public class Ex05큰수찾기 {
	public static void main(String[] args) {
		int[] yuni = new int[5];
		int max =0;
		System.out.println(yuni);
		
		Random rd = new Random();
				
		for(int i=0; i<=4; i++) {
			yuni[i] = rd.nextInt(10)+1;
			if(yuni[i]>max) {
				max =yuni[i];
			}
		}
		System.out.println(Arrays.toString(yuni));
		System.out.println("가장 큰 값은"+max);
	}	
}
