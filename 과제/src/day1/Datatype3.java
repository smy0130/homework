package day1;

public class Datatype3 {

    public static void main(String[] args) {
        // 정수 최대값에 1을 더해 결과 확인 : 정수의 경우, int 데이터 타입은 표현 가능한 범위를 넘어가면 
    										//overflow가 발생하여 음수 값으로 돌아감
    	int maxInt = Integer.MAX_VALUE;
        int exceededInt = maxInt + 1;
        System.out.println("정수 최대값 + 1: " + exceededInt);

        // 실수 최대값에 1을 더해 결과 확인 : double이라 차이가 그닥 없어보임
        double maxDouble = Double.MAX_VALUE;
        double exceededDouble = maxDouble + 1.0;
        System.out.println("실수 최대값 + 1: " + exceededDouble);
    }
}
