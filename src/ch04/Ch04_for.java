package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_for {
    public static void main(String[] args) {
       /* String[] n = {"one", "two", "three"};
        //초깃값
        for(int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }*/

        //ex: 5명의 학생이 시험을 보고 있음 시험이60 넘으면 합격 나머지는 불합격이다
//        int[] marks = {90, 25, 70, 45, 80};
//        for(int i=0;  i<marks.length; i++){
//           /* if(marks[i]>=60) {
//                System.out.println((i+1)+"번 학생은 합격입니다");
//            } else {
//                System.out.println((i+1)+"번 학생은 불합격입니다");
//            }*/
//
//            //합격한 학생만 출력
//            if(marks[i]<60){
//                continue;
//            }
//            System.out.println((i+1)+"번 학생 축하합니다. 합격이다");
//            }
//        }

        //이중 for 문: for문 안에 for 문을 사용
        //구구단사용
//                for (int i=2; i<10;i++) {
//                    for (int j = 1; j < 10; j++) {
//                        System.out.print(i * j + " ");
//                    }
//                    System.out.println("");
//                }
        //for each문
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));

        for(String s : numbers) {
            System.out.println(s);
        }
    }
}
