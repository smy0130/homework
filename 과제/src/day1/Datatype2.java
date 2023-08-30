package day1;

public class Datatype2 {

    public static void main(String[] args) {
        // 두 개의 정수 변수 선언 및 초기화
        int num1 = 9;
        int num2 = 3;

        // 정수 나누기 연산 결과를 실수 변수에 저장하고 출력
        double divisionResult1 = (double) num1 / num2;
        System.out.println("정수 나누기 결과: " + divisionResult1);

        // 두 개의 실수 변수 선언 및 초기화
        double double1 = 7.5;
        double double2 = 3.0;

        // 실수 나누기 연산 결과를 정수 변수에 저장하고 출력
        int divisionResult2 = (int) (double1 / double2);
        System.out.println("실수 나누기 결과: " + divisionResult2);
    }
}