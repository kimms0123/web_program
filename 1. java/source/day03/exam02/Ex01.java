package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 10;

        // 실행 코드가 1줄이면 {..} 생략 가능 => 지양
        if (num == 10) // 조건식이 참일 때 실행
            System.out.println("10입니다");
         else  // 조건식이 거짓을 때 실행
            System.out.println("10이 아닙니다");


        // 간단한 조건문 => 삼항 조건 연산식 대체 가능
        String result = num == 10 ? "10입니다" : "10이 아닙니다";
        System.out.println(result);

    }
}
