package 연습_메소드;

public class Ex06 {
    public static void main(String[] args) {

        //변수생성
        int score1 = 96;
        int score2 = 85;
        int score3 = 80;

        //결과출력
        System.out.printf("%d점 -> %s\n", score1, grade(score1));
        System.out.printf("%d점 -> %s\n", score2, grade(score2));
        System.out.printf("%d점 -> %s\n", score3, grade(score3));
    }

    public static String grade(int score) {
        if(score > 95){
            return "A+";
        } else if(score > 85){
            return "B+";
        } else if(score > 80){
            return "B";
        } else {
            return "나머지는 나락입니다";
        }
    }
}
