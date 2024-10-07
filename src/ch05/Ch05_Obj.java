package ch05;

//별도의 계산기 클래스
class Calculator {
    int result = 0; //변수

    //클래스 안에 함수를 메소드라고 함
    /**
     *정수를 입력해 더해준 결과값을 리턴
     * @param num 입력정수
     * @return result 결과
     */
    int add(int num) {
        result += num;
        return result;
    }
}

class Animal{
    String name; //객체변수

    //메서드
    public void setName(String name) {
        this.name = name;
    }
}



public class Ch05_Obj {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(5));
        System.out.println(cal2.add(7));

        //클래스로 객체를 만든다.
        Animal cat = new Animal(); //인스턴스 내가 만든 객체이름

        //메서드 호출
        cat.setName("고양이");
        System.out.println(cat.name);

    }
}
