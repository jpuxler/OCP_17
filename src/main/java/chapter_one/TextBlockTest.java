package chapter_one;

public class TextBlockTest {

    public static void main(String[] args) {
        String textBlock = """
                "Java Study Guide"
                 by Scott & Jeanne""";
        System.out.println(textBlock);

        String pyramide = """
                  *
                 **
                ***
                """;
        System.out.println(pyramide);

        String format1 = """
                Das ist ein Beispiel um zu testen wie etwas sich verhätl \
                Das ist komisch
                """;
        System.out.println(format1);

        var format2 = """
                doe \n
                deer
                """;
        System.out.println(format2);

        var format3 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*"+format3+"*");
    }
}
