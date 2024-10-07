package 연습_메소드;

public class Ex04 {
    public static void main(String[] args) {
        double doller = dice() + dice() + dice();
        double won = exchange(doller);
        System.out.printf("획득 금액: $%.2f (%.0f원)", doller, won);
    }

    public static double dice() {
        return Math.random()*6+1;
    }

    public static double exchange(double doller) {
        double x = 1500;
        return doller * x;
    }
}
