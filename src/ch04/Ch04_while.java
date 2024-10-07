package ch04;

public class Ch04_while {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit< 10) {
            treeHit++;
            System.out.println("나무를" + treeHit + "번 찍습니다");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다");
            }
        }
        //break : 반복문 빠져나오기
     /*   int coffee =10;
        int money = 300;
        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if(coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매가 안된다고 야발년아");
                break;
            }
        }*/

        //continue : 박복문의 조건으로 돌아가기
       /* int a =0;
        while(a < 10) {
            a++;
            if(a%2 == 0) {
                continue;
            }
            System.out.println(a);
        }
        */
    }
}
