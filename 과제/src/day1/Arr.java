package day1;

public class Arr {
    public static void main(String[] args) {
        // 가. 5개의 크기를 가진 정수 배열을 직접 값으로 초기화
        int[] intArray1 = {1, 2, 3, 4, 5};

        // 나. 10개의 크기를 가진 정수 배열을 new 연산자로 초기화
        int[] intArray2 = new int[10];

        // 다. 6번째 요소에 값을 할당하고, 첫 번째 요소부터 6번째 요소까지 값을 출력
        intArray2[5] = 10;
        for (int i = 0; i < 6; i++) {
            System.out.println("intArray2[" + i + "] = " + intArray2[i]);
        }

        // 라. 6개의 크기를 가진 실수 배열을 생성하고 값을 할당  
        double[] doubleArray = new double[6]; // 6개라고 적어서 오류 발생
        doubleArray[5] = 40.1;
        doubleArray[6] = 50.1;
        doubleArray[7] = 60.1;

        // 마. 라의 결과 출력
        for (int i = 5; i < 8; i++) {
            System.out.println("doubleArray[" + i + "] = " + doubleArray[i]);
        }

        // 바. 4개의 크기를 가진 문자열 배열을 초기화하고 결과 출력
        String[] stringArray = {"korea", "england", "japan", "china"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "] = " + stringArray[i]);
        }
    }
}

