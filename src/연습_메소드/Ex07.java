package 연습_메소드;

public class Ex07 {
    public static void main(String[] args) {
        //변수생성
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double kateVocal = 9.2;
        double kateDance = 7.8;

        //결과출력
        System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
        System.out.printf("Kate의 오디션 결과: %s\n", test(kateVocal, kateDance));

    }
    public static String test(double vocal, double dance) {
        double result = (vocal * dance);
        String sum = (result >= 70) ? "합격":"불합격";
        return sum;
    }
}
