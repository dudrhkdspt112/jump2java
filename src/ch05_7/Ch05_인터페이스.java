package ch05_7;

interface Predator {
    //추상메서드 (구현이 되지 않은 메서드로 {몸통}이 없음)
    String gotFood(); //여러개 구현이 가능하다.. 이유 코드 재사용,유연성을 높임
}

class ZooKeeper {
    public void feed(Predator p) {
        System.out.println("먹이주기"+p.gotFood());
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String gotFood() {
        return " 호랑이에게 가젤";
    }
}

class Lion extends Animal implements Predator {
    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String gotFood() {
        return " 사자에게 악어";
    }

}

public class Ch05_인터페이스 {
    public static void main (String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        ZooKeeper z = new ZooKeeper();
        z.feed(t); //인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(l);
    }
}
