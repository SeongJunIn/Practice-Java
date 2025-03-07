package groom.chap04.section01.conditional;
import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement(){

        /* 목표. switch문 단독 사용에 대한 흐름을 이해가 적용할 수 있다. */

        /* 정수 두 개와 연산 기호 문자를 입력 받아서
         * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연간 결과가 달라짐 */
        switch(op){

            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

                case '*':
                    result = first * second;
                    break;

                    case '/':
                        result = first / second;                    //second가 0이면 에러 발생
                        break;

            case  '%':
                result = first % second;
                break;

            /* default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 작성해주는 것이 좋다. */
            /* 산술연산 이외 다른 문자에 대한 처리는 생략하였음 */

        }

        System.out.println(first + " " + op + second + " " + " = " + result);

    }
}
