package ch04;

class CarMain {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car("red", "현대");
        Car myCar1 = new Car("red", "현대");
        Car myCar2 = new Car("red", "현대");
        Car myCar3 = new Car("red", "현대");
        Car myCar4 = new Car("red", "현대");
        Car myCar5 = new Car("red", "현대");

        System.out.println(myCar);
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);
        myCar.drive();
        System.out.println(myCar);
    }
}