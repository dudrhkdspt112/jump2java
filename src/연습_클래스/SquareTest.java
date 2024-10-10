package 연습_클래스;

public class SquareTest {
    public static void main(String[] args) {
        /*1객체 생성*/
        Square s = new Square();
        /*2필드 초기화(값 변경)*/
        s.length = 4; //정사각형 가로세로 길이는 4로 결정
        System.out.printf("한 별의 길이가 %d인 정사각형의 넓이 : %d", s.length, s.area());
    }
}

/*4.정사각형 클래스 구현*/
class Square {
    int length;
    //넓이 변환
    int area() {
        return length * length;
    }
}