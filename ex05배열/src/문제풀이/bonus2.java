package 문제풀이;

public class bonus2 {
	public static void main(String[] args) {
		// 입력 : power , test
		// 출력 : w , es
		// 입력된 문자의 개수가 홀수인지, 짝수인지 판별 중요
		// - 짝수 : 가운데 2글자
		// - 홀수 : 가운데 1글자
		String word = "address";
		String[] arr=word.split("");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(getmiddle("power"));
		System.out.println(getmiddle("test"));
	}

	private static String getmiddle(String input) {
		String[] arr =input.split("");
		int num = arr.length;
		String result = null;
		System.out.println();
		if(num%2==0) {
			// 글자수가 짝수인 경우
		result = arr[num/2-1]+arr[num/2];
		}else {
			result = arr[num/2];
		}
		return result;
	}
}
