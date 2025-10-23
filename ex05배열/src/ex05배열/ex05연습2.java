package ex05배열;

import java.util.Random;

public class ex05연습 {
   public static void main(String[] args) {
      int[] huya = new int[5];
      System.out.println(huya);
      
      Random rd = new Random();
      
      // 랜덤 수 생성
      for (int i = 0; i <= 4; i++) {
         huya[i] = rd.nextInt(100) + 1;
      }
      
      // 홀수 출력
      System.out.println("랜덤한 정수 중에서 홀수");
      for (int i = 0; i <= 4; i++) {
         if (huya[i] % 2 == 1) {
            System.out.print(huya[i] + " ");
         }
      }
      
      System.out.println();
      System.out.println(huya[0]);
      System.out.println(huya[1]);
      System.out.println(huya[2]);
      System.out.println(huya[3]);
      System.out.println(huya[4]);
      
      System.out.println("=============");
   }
}
