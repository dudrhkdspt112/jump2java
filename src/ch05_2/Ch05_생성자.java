package ch05_2;

class Animal {
    Animal() {
        System.out.println("애니몰 생성자 생성");
    }

    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("도그 생성자 생성!!");
    }

    void sleep() {
        System.out.println(this.name+"zzz");
    }
}

class HouseDog extends Dog {
    //이름을 처음부터 입력하는 생성자
    HouseDog(String name) {
        this.setName(name);
    }

    //타입을 결정하는 생성자
    HouseDog(int type) {
        if(type == 1) {
            this.setName("요크셔");
        } else if(type == 2) {
            this.setName("진돗개");
        }
    }

    void sleep() {
        System.out.println(this.name + "집에서 자!");
    }
}


public class Ch05_생성자 {
    public static void main(String[] args) {
        Dog d = new Dog(); //디폴트 생성자
        //HouseDog h = new HouseDog(); 생성자가 입력변수가 있으면 우선사용
        HouseDog h1 = new HouseDog("해피"); //이름을 입력하는 생성자
        HouseDog h2 = new HouseDog(1); //타입을 입력하는 생성자
        System.out.println(h1.name);
        System.out.println(h2.name);
    }
}
