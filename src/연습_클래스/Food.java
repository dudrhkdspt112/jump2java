package 연습_클래스;

import org.w3c.dom.ls.LSOutput;

class Food1{
    /*필드를 추가 하세요*/
    String name;
    int price;

    /*생성자를 추가하세요*/
    public Food1(String name, int price) {
        this.name = name;
        this.price = price;
    }


    /*toString() 메소드를 추가하세요*/
    public String toString() {
        return name + ":" + price+ "원";
    }
}

public class Food {
    public static void main(String[] args) {
        // 음식 객체 생성
        Food1 Chicken = new Food1("치킨", 18000);
        Food1 pizza = new Food1("피자", 28000);
        Food1 sushi = new Food1("초밥셋트", 22000);

        //객체 배열에 음식 담기
        Food1[] foods = {Chicken, pizza, sushi};

        //모든 음식 정보 출력
        for(int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].toString());
        }
    }
}

