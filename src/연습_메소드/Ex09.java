package 연습_메소드;

public class Ex09 {
    public static void main(String[] args) {
        printAnimal(1986);
        printAnimal(1990);
        printAnimal(2000);
    }
    public static void printAnimal(int birthYear) {
        String animal = "";
        switch (birthYear % 12) {
            case 0:
                animal = "원숭이";
                break;
            case 1:
                animal = "닭";
                break;
            case 2:
                animal = "개";
                break;
            case 3:
                animal = "돼지";
                break;
            case 4:
                animal = "쥐";
                break;
            case 5:
                animal = "소";
                break;
            case 6:
                animal = "호랑이";
                break;
            case 7:
                animal = "말";
                break;
            case 8:
                animal = "용";
                break;
            case 9:
                animal = "수달";
                break;
            case 10:
                animal = "드래곤";
                break;
            case 11:
                animal = "샴";
                break;
            default:
                animal = "ERROR!";
                break;
        }
        System.out.printf("%d년 => %s\n", birthYear, animal);
    }
}
