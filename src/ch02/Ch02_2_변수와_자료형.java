package ch02;

public class Ch02_2_변수와_자료형 {
    public static void main(String[] args) {

        //변수의 선언
        int a; //변수의 선언: 정수형 변수 a를 만듬
        String b;

        //변수값을 확인
        //System.out.println(a);
        //System.out.println(b);

        //변수의 값을 초기화
        a = 1;
        // = 대입연산자 :값을 입력해라
        b = "Hello";
        // 문자열 쌍다옴표를 사용 문자1개는 ''한 따옴표 사용 c = 'a';처럼
        char c = 'A'; //문자타입 c 변수를 선언과 동시에 초기화

        String d = "abc";

        //변수값을 확인
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //변수는 값을  바꿀수 있다.
        a = 77777777;
        b = "헬로우";

        //변수값을 확인
        System.out.println(a);
        System.out.println(b);

        /*
        이프로그램의 저작권은
        나에게 있습니다
        Copyright 2024
        */
    }
}
