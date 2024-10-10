package 연습_클래스;

public class CylinderTest {
    public static void main(String[] args) {
        //객체생성
        Cylinder c = new Cylinder(4,5);


        //출력
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());

    }
}

class Cylinder {
    /*필드와 메소드를 구현하시오.*/
    double r;
    double h;
    double pi;
    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        this.pi = Math.PI;
    }
    double getVolume() {
        return Math.PI * r * r * h;
    }
    double getArea() {
        return Math.PI * r * r * r;
    }
}
