package ex05배열;

public class 메서드실습5 {

	public static void main(String[] args) {
		
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	private static int powerN(int base, int n) {
		int result =0;
		//2*2*2 -> 4*2 -> 이전 연산결과 *base(2)
		for(int i=1; 1<=n; i++) {
			// 이전 연산결과 * basee 누적
			// base를 n번만큼 곱해줘야 한다
			result*=base // result = result*base
			// 복합대입연산자 += -= *=
			System.our.println()result;
		}
		}
	
		return 0;
	}

}
