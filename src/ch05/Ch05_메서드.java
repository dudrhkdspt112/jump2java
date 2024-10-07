package ch05;

class Sample {
    int sum(int a, int b) { //매개변수(parameter)
        return a + b;
    }

    //입력은 없고 문자열 "hello"가 반환됨
    String say(){
        return "Hello";
    }

    //return값이 없는 메서드
    void sum2(int a, int b) {
        System.out.println(a+"와"+ b+"의 합은"+(a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d 입니다.%n", a, b, a+b);
    }

    //입력 리턴이 없는 값
    void hello(){
        System.out.println("Hello");
    }

    //리턴으로 빠져나오기(메서드에서 리턴을 만나면 종료됨)
    void SayName(String nick) {
        if("바보".equals(nick)||"등신".equals(nick)) {
            return;// 종료
        }
        System.out.println("나의 별명은"+nick+" 입니다");
    }

    //메서드 안에 선언 변수 효력범위(메서드 안에서만 사용)
    int varTest (int a) {
        a++;
        return a;
    }
}

public class Ch05_메서드 {

    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;

        Sample sample = new Sample();
        // 객체,메소드명 => 메소드호출 이때 전달하는 입력값을 인수
        //int c = sample.sum(a, b); //인수
        int c = sample.sum(3, 4);
        System.out.println(c);

        String hi = sample.say();
        System.out.println(hi);

        //sum2
        sample.sum2(3,4);
        //변수에 담아서 안하는 이유는 리턴값이 없어서 바로 사용이 가능하기 때문이다.

        sample.hello();

        sample.SayName("천재");
        sample.SayName("바보");

        //효력범위
        int a= 1;
        a = sample.varTest(a);
        System.out.println(a);
    }
}
