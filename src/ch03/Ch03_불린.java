package ch03;

public class Ch03_불린 {
    public static void main(String[] args) {
        //불(boolean) : 참 또는 거짓 자료형
        boolean isSuccess = true;
        boolean isTest = false;

        //주로 삼항 연산자나 if문에 사용(조건문)
        System.out.println(2>1);
        System.out.println(1==2);
        System.out.println(3 % 2 ==1);

        //조건문 사용
        int base = 180;
        int h = 185;
        boolean isTall = h > base;
        //if 문에는 조건이 참일때만 명령문을 실행!
        if (isTall) {
            System.out.println("키가 큽니다");
        }

        int key = 150;
        int x = 155;
        boolean isWhat = x > base;
        if(key < x) {
            System.out.println("키가 큽니다");
        }
    }
}
