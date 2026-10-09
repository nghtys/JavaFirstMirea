package ru.mirea.task7;

public class ProcessStrings implements StringOperations {
    @Override
    public int countCharacters(String text) {
        return text.length();
    }

    @Override
    public String oddPositionCharacters(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        StringOperations processor = new ProcessStrings();
        String text = "Привет";

        System.out.println("Исходная строка: " + text);
        System.out.println("Количество символов: " + processor.countCharacters(text));
        System.out.println("Символы на нечетных позициях: "
                + processor.oddPositionCharacters(text));
        System.out.println("Перевернутая строка: " + processor.reverse(text));

        check(processor, "", 0, "", "");
        check(processor, "A", 1, "A", "A");
        check(processor, "Java", 4, "Jv", "avaJ");
        check(processor, "abcde", 5, "ace", "edcba");
        check(processor, "Привет", 6, "Пие", "тевирП");
        System.out.println("Все 5 проверок пройдены.");
    }

    private static void check(StringOperations processor, String text,
                              int expectedCount, String expectedOdd,
                              String expectedReverse) {
        if (processor.countCharacters(text) != expectedCount
                || !processor.oddPositionCharacters(text).equals(expectedOdd)
                || !processor.reverse(text).equals(expectedReverse)) {
            throw new AssertionError("Ошибка обработки строки: " + text);
        }
    }
}

interface StringOperations {
    int countCharacters(String text);

    String oddPositionCharacters(String text);

    String reverse(String text);
}
