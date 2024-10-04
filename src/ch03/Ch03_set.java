package ch03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ch03_set {
    public static void main(String[] args) {
        //set 은 리스트중에 반복되지 않음
        HashSet<String> set = new HashSet<>(Arrays.asList("a", "b", "c", "d", "d"));
        System.out.println(set);

        //교집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1);//s1으로 교집합생성 기준생성
        intersection.retainAll(s2);//교집합 수행
        System.out.println(intersection);

        //합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);// 중복 되는건 뺀다
        System.out.println(union);

        //차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);//s1 기준으로 s2되는걸 삭제한다.
        System.out.println(substract);// 값:1,2,3

        //메소드 add. addAll, remove
        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3);

        //addAll
        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList("And", "Home"));
        System.out.println(s4);

        //remove
        s4.remove("Home");
        System.out.println(s4);
    }
}
