package text.section_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExec_Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "e", "d", "b", "c"));

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
