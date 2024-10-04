package ch03;

import java.util.HashMap;

public class Ch03_Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //맵은 추가를 put 으로 함
        map.put("people", "사람");
        map.put("baseball", "야구");
        //자료를 가져올때 get을 사용(map.get(key))
        System.out.println(map.get("people"));

        //맵에 해당값이 있는지 확인(containsKey
        System.out.println(map.containsKey("baseball"));

        //remove 삭제를 하다(키값)
        System.out.println(map.remove("baseball"));
        //remove 삭제하고 키:핀폴 밸류:사람만 남는다
        System.out.println(map);

        //size 맵 요소의 갯수를 리턴(length의길이)
        System.out.println(map.size());
        map.put("name", "영광"); //put을 사용하여 네임을 추가
        System.out.println(map.size());// length를 확인


        //ketSet,values 맵의 모든 키,밸류를 모아서 리턴(반환하다)
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
