package ex05배열;

public class 이차원배열 {
	public static void main(String[] args){
		// 이차원 배열 : 배열 속에 또 다른 배열이 있는 형태
		// int[][] array = new int[행][열]
		// 3행 3열의 이차열 배열 선언
		int[][] array = new int[3][3];
		System.out.println(array); // 주소값
		System.out.println(array[0]);
		// 출력 예시 -> 행과 열의 인덱스 번호 이용
		// 1 2 3
		// 4 5 6
		// 7 8 9
	int num=1;
	for(int hina=0; hina<=2; hina++) {	
		for(int rin=0; rin<=2; rin++) {
			array[hina][rin] = num++;
			}
		System.out.println();
	}
		
		
		/*array[0][0] = num++;
		array[0][1] = num++;
		array[0][2] = num++;
		
		array[1][0] = num++;
		array[1][1] = num++;
		array[1][2] = num++;
		
		array[2][0] = num++;
		array[2][1] = num++;
		array[2][2] = num++;*/
		
		
		for(int j=0; j<=2; j++) {
			for(int i=0; i<=2; i++) {
				System.out.print(array[j][i]);
			}
			System.out.println();	
		}
		System.out.println("===============");
		for(int i=0; i<=2; i++) {
			System.out.print(array[0][i]);
		}
		System.out.println();
		
		for(int i=0; i<=2; i++) {
			System.out.print(array[1][i]);
		}
		System.out.println();
		
		for(int i=0; i<=2; i++) {
			System.out.print(array[2][i]);
		}
		System.out.println();
	}
}
