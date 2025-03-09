package groom.mission.java_basic1;

import java.util.Scanner;

public class Mission3 {

    public static void main(String[] args) {

        /* 목표. 자신의 이름과 나이를 출력하는 Java 프로그램 작성하기 */

        Scanner sc = new Scanner(System.in);

        System.out.println("작성자의 이름을 적어주세요 : ");
        String name = sc.nextLine();

        System.out.println("작성자의 나이를 적어주세요 : ");
        int age = sc.nextInt();

        System.out.println("작성자는 " + name + ", " + age + "세입니다.");

    }
}
