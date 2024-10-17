package exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num = 10;

        boolean result1 = num++ > 10 && (num = num + 20) >= 20;
        System.out.println(num); // num = 11, 왼쪽 항이 false => 판별완료, 오른쪽 항 체크 X
        // => 단락 회로 평가
    }
}
