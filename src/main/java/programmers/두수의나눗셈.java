package programmers;

public class 두수의나눗셈 {class Solution {
    public int solution(int num1, int num2) {
        double result = 0;

        if((num1>0&&num1<=100)&&(num2>0&&num2<=100)){

            result = ((double) num1 / (double) num2) * 1000;
        }

        return (int) result;
    }
}
}
