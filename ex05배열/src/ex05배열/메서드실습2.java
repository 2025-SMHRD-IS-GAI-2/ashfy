package ex05배열;

public class 메서드실습2 {
	public static void main(String[] args) {
		int yuji = 50;
		int megumi = 15;
		String nobara = "-";
		
		System.out.println(satoru(yuji, megumi, nobara));
		
	}

public static int satoru(int yuji, int megumi, String nobara){
	//입력한 nobara가 어떤 연산자인지 판단 -> 조건문 사용
	
	// 숫자 vs 숫자 -> ==
	// 문자 vs 문자 -> .equals()
		if(nobara.equals("-")){
			return yuji - megumi;
		}
		else if(nobara.equals("+")) {
			return yuji+megumi;
		}
		else if(nobara.equals("*")) {
			return yuji*megumi;
		}
		else if(nobara.equals("/")) {
			return yuji/megumi;
		}
		else {
			return 0;
		}
	}
}