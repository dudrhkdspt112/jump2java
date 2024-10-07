package ch04;

import java.util.ArrayList;

public class Ch04_if {
    public static void main(String[] args) {
       int money = 3000;
       boolean isCard = true;
       if(money >= 3000 || isCard) {
           System.out.println("택시를 타고 가리");
       }else {
           System.out.println("걸어가");
       }
       //if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("peper");
        pocket.add("cellphone");
        pocket.add("money");
        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가리");
        }else {
            System.out.println("걸어가");
        }

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가리");
        } else if (isCard){
            System.out.println("카드로 택시를 타고 가라");
        } else {
            System.out.println("걸어가");
        }

    }
}
