package Javebase1;

import java.util.Scanner;

public class Mission2 {

    public static void main(String[] args) {

        /* 목표 사용자로부터 두 숫자를 입력받아 합계 출력하는 Java 프로그램 작성하기 */

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요 : ");
        int number1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력해주세요 : ");
        int number2 = sc.nextInt();

        int sum = number1+number2;

        System.out.println("두 수의 합은 : " + sum + "입니다.");
    }
}
