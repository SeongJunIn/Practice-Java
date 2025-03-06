package programmers;

public class 두수의차 {

    public int solution(int num1, int num2) {
        int answer = 0;

        if ((num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000)) {
            answer = num1 - num2;
        } else {
            System.out.println("값의 범위를 벗었났습니다.");
        }
        return answer;
    }

    // main 메서드 추가
    public static void main(String[] args) {
        두수의차 calculator = new 두수의차();
        int result = calculator.solution(100, 50); // 예시 입력
        System.out.println("결과: " + result); // 결과 출력
    }
}