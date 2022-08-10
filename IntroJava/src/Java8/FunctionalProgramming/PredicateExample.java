package Java8.FunctionalProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        System.out.println(specialWorkChecker());
        Predicate<String> specialWorkChecker = new Predicate<String>() {
            public boolean test(String t) {
                return t.contains("Download");
            }
        };

        System.out.println(specialWorkChecker.test("Download nehs"));
    }
}
