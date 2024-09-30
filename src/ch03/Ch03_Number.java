package ch03;

public class Ch03_Number {
    public static void main(String[] args) {
        //정수 타입(자료형)-int가 기본형
        int age = 10;
        long count = 4565456456465456456L;

        //실수(더블이 기본형
        float pi = 3.14F; //특별한 경우가 아니라면 사용안함
        double pi2 = 3.141592653589793238;

        //8진수(0)으로 시작 와 16진수(0x)으로 시작
        int octal = 023;
        int hex = 0xC3;
        System.out.println(octal);
        System.out.println(hex);

        // 숫자연산(+ - * /):사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3);
        System.out.println(3%7);

        //증감연산(++, --)1씩 증가, 1씩 감소

        int i = 1;
        int j = 10;
        i++; //1
        System.out.println("i값" + i);
        j--;
        System.out.println(i);
        System.out.println(j);

        System.out.println(++i);
        System.out.println(j--);
        System.out.println(j);

        int x = i++;
        int y = i + --j;
        System.out.println(x);
        System.out.println(y);
    }
    //
}
