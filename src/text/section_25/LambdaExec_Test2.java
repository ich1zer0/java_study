package text.section_25;

public class LambdaExec_Test2 {
    public static void main(String[] args) {
        Lambda_Test2 lambda = new Lambda_Test2() {
            public void test2(String str) {
                System.out.println(str);
            }
        };

        lambda.test2("匿名クラスを使って実装しました");
    }
}
