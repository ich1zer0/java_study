package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test3 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);

        LocalDateTime dateTime2 = LocalDateTime.of(1999, 1, 2, 5, 10, 20);
        System.out.println(dateTime2);
    }
}
