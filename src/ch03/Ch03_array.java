package ch03;

public class Ch03_array {
    public static void main(String[] args) {
        //정수 int 배열 int앞에 대괄호가 온다
        int[] odds = {1,3,5,7,9}; //{}
        //문자열 String 배열
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"} ;
        System.out.println(weeks.length);
        //배열을 객체로 만들기 (new 키워드)
        String[] week = new String[7]; //배열의 길이를 정함(초기값 x)
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";
        System.out.println(week.length);

        //배열값에 접근하기
        String[] week2 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(week2[0]);

        //배열의 길이를 구하기(반복문 사용)
        String[] week3 = {"월", "화", "수", "목", "금", "토", "일"};
        for(int i = 0; i <week3.length; i++) {
            System.out.println(week3[i]);
        }
    }
}
