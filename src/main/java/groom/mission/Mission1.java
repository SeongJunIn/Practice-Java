package Javebase1;

import java.util.Scanner;

public class Mission1 {

    public static void main(String[] args) {

        /* 목표. 사용자로부터 두 숫자 입력 받고 더 큰 숫자 출력하기  */

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요 : ");
        int number1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요 : ");
        int number2 = sc.nextInt();

        if (number1 == number2) {

            System.out.println("두 숫자가 같습니다.");

        }else if(number1 > number2) {

            System.out.println("두 숫자 중 더 큰 숫자는 " + number1 + "입니다");

        }else {

            System.out.println("두 숫 자중 더 큰 숫자는 " + number2 + "입니다.");
        }

            }
}
