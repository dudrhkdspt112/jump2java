package ch05;

public class Ex08 {
    public static void main(String[] args) {

        //변수생성
        int a = 13;
        int b = 7;
        int c = 10;

        //결과출력
        System.out.printf("%d층 -> %s 엘레베이터%n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터%n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터%n", c, guide(c));
    }

    public static String guide(int n) {

         if(n < 10) {
             return "저층";
         } else if(n < 20) {
             return "고층";
         } else{
             return "";
         }
    }
}
