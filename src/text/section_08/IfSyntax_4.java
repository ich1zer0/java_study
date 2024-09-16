package text.section_08;

public class IfSyntax_4 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10);

        System.out.println(randNum);

        if((1 < randNum) && (randNum < 3)) {
            System.out.println("randNumは1より大きい、かつ3より小さい値です");
        } else {
            System.out.println("and条件が成り立ちません");
        }

        if((randNum == 1) || (randNum == 3)) {
            System.out.println("randNumは1または3です");
        } else {
            System.out.println("or条件が成り立ちません");
        }
    }
}
