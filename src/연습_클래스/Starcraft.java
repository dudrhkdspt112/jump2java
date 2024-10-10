package 연습_클래스;

import javax.swing.plaf.metal.MetalDesktopIconUI;

public class Starcraft {
    public static void main(String[] args) {
        //객체생성
        Marine marine = new Marine("마린", 80);
        Madic medic = new Madic("메딕", 60);
        marine.stimpack();
        medic.heal(marine);

    }
}

//마린클래스
class Marine {
    //필드
    String name;
    int hp;

    //생성자
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드
    void stimpack() {
        System.out.printf("[%s}의 스팀백! HP: %d -> ", name, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }
}

//메딕클래스

class Madic {
    //필드
    String name;
    int hp;

    //생성자
    public Madic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //메소드
    void heal(Marine target) {
        System.out.printf("[%s]의 치유! %s HP: %d -> ", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d\n", target.hp);
    }
}
