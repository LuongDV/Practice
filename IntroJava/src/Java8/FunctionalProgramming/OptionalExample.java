package Java8.FunctionalProgramming;

import java.util.function.Function;

public class OptionalExample {
    public static void main(String[] args) {
        Function<String, String> getSecondWord = (String s) -> {
            return s.split(" ").length > 1 ? s.split(" ")[1] : null;
        };
        Function<String, Integer> getLetterCount = t -> t.length();
    }
}
