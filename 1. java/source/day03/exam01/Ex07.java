package exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num = 50;
        boolean result = num >= 10;
        System.out.println(result);

        boolean result2 = num <= 100;
        System.out.println(result2);

        // 10 이상이고 100 이하인 것을 논리 연산자를 사용하여 작성하시오
        boolean result3 = result && result2; // result1 & result2 모두 참일 때 참
        System.out.println(result3);

        boolean result4 = num >= 10 && num <= 100;
        System.out.println(result4);

    }
}



