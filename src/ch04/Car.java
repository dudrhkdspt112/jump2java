package ch04;

class Car {
    //속성
    String color;
    String model;

    //생성자

    Car(String colo, String model) {
        color = colo;
        this.model = model;
    }

    //메서드
    //보이드는 리턴 x
    void drive() {
        System.out.println("the"+color+" "+model+" is driving");

    }
}


