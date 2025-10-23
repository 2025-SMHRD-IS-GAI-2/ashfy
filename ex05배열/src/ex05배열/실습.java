package ex05배열;

public class 실습 {

	public static void main(String[] args) {
		System.out.println(jogo(3,5));
		System.out.println(hanami(3,5));
		System.out.println(mahito(3,5));
		System.out.println(dagon(3,5));
	}
public static int jogo(int i, int j) {
	return i+j;
}
public static int hanami(int i, int j) {
	return i-j;
}
public static int mahito(int i, int j) {
	return i*j;
}
public static int dagon(int i, int j) {
	return i/j;
}









}