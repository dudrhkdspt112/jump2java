package 연습_메소드;

public class Ex05 {
    public static void main(String[] args) {
        wear(2400, 2000);
        wear(3800, 1200);
        wear(1998, 1200);
        wear(1999, 2000);
    }

    public static void wear(int hp, int mp) {

        if(hp >= 2000 && mp >= 2000) {
            System.out.println("아이템이 장착이 완료되었습니다");
        } else{
            System.out.println("아이템을 장착 할수가 없습니다");
        }
    }
}
