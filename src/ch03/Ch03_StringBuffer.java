package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        //문자열 추가하거나 변경할때 사용하는 자료형
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.append(" ");
        sb.append("점프 to 자바");
        String result = sb.toString();
        System.out.println(result);
        //sb 대신 문자열로 해보자.(""문자열(리터럴)을 만들면 수정할 수 없다)
        String aa = "";
        aa += "안녕";
        aa += " ";
        aa += "점프 to 자바";
        System.out.println(aa);

        //insert 특정 위치에 문자열을 삽입
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "hello"); //0번째 인덱스에 추가해라
        System.out.println(sb2);

        //substring 문자열 시작과 끝점 알아내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb.substring(1,4));
    }

}
