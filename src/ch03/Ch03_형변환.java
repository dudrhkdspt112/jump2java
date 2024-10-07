package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_형변환 {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        String num2 = "1.1265";
        Double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        //반대로 정수를 문자열로 변환한다
        int n3 =456;
        String num3 = ""+n3;// 문자열 더하기 숫자는 문자열이 됨
        System.out.println(num3);
        String num4 = String.valueOf(n3);
        String num5 = Integer.toString(n3);
        System.out.println(num4);
        System.out.println(num5);

        //문자열을 실수로 변환
        String num6 = "123.456";
        double n6 = Double.parseDouble(num6);
        System.out.println(n6);

        //정수와 실수 변환
        int n4 = 12345;
        double d2 = n4; //정수 => 실수(자동변환)
        System.out.println(d2);

        double d3 = 123.956;
        int n5 = (int) d3; //캐스팅 (변환타입)
        System.out.println(n5);

        //형변환시 주의점: 변활될 타입과 문자열 내용이 틀리면
        /*String num7 = "123.456";
        int n6 = Integer.parseInt(num7);*/

        String num7 = "123.4560";
        double n8 = Double.parseDouble(num7);
        System.out.println(n8);

        //final 키워드는 값을 한번만 설정 고정값 바꿀수 없음;
        final int n7 = 123;
//        n7 = 456
        //파이널을 사용해 어레이리스트를 한번만 사용한다
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //add 추가 값은 사용이 가능하다
        a.add("c");
        System.out.println(a);
        // 위에 final을 사용해서 사용이 불가하다; 그래서 에러 작용
//        a = new.ArrayList<>();




    }
}
