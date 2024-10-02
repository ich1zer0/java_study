package text.section_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExec_Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("ab", "ac", "bc", "cd", "de"));

        list.stream()
                .filter(param -> param.startsWith("a"))
                .forEach(System.out::println);
    }
}
