package 연습_메소드;

public class Ex10 {
    public static void main(String[] args) {

        //입력값 받기
        double start = 72.4;
        int after = 5;

        //계산
        double result = weight(start, after);

        //결과 출력
        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    public static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        for(int i=0; i<months; i++) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
