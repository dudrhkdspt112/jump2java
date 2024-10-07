package ch05;

import java.sql.SQLOutput;

class Anima {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Anima {//Anima 클래스를 상속시킨다(애니마의 자식임)
    //생성자는 클래스명과 같고 리턴이 없다
    //그중에 디폴트생성자는 입력변수가 없다(생략가능)
    Dog() {
        System.out.println("도그객체를 생성!");
    };

    void sleep() {
        System.out.println(this.name + "zzzz");
    }
}

class Housedog extends Dog {
    //오버라이딩: 부모인 독의 메소드 가져와 덮어버리고 내용을 더 추가하거나 다르게 수정하는 일
    //대신에 메소드의 이름이 같아야 오버라이딩이 된다.
    void sleep() {
        System.out.println(this.name + "zzzz in house");
    }

    //오버로딩: 메소드는 이름외에 리턴타입과 입력변수가 똑같지 않으면 새로운 메서드임
    void sleep(int hour) {
        System.out.println(this.name + "zzzz in house" + hour + "시간");
    }

}


public class Ch05_inheritance {
    public static void main(String[] args) {
        Anima a = new Dog(); //애니마가 부모라 객체를 만들때 도그가 자식이기 때문에 객체타입으로 선언가능하다.
        Dog d = new Dog();
        d.setName("poppy");
        System.out.println(d.name);
        d.sleep();


        //메서드 오버라이딩: 부모메서드와 똑같은 이름의 메서드를 새로 만듬
        Housedog h = new Housedog();
        h.setName("happy");
        h.sleep();

        //메서드 오버로딩(overloading): 메소드의 이름은 같지만 입력변수가 틀리다(다른 메소드)
        h.sleep(10);
        //sout치면 밑에처럼 나온다
        System.out.println();
        //자바는 상속은 하나만 가능, 두개이상은 상속이 불가능하다 a 자식이 b, c라면 b,c의 자식인 d는 한꺼번에
        //상속을 받지 못한다,
    }
}
