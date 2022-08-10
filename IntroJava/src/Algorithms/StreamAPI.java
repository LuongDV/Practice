package Algorithms;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
//        JsonObject jsonObject = new JsonObject();
//
//        jsonObject.addProperty("Username", "kim");
//        jsonObject.addProperty("Score", "8666");
//        jsonObject.add("ExtendedProperty", new JsonObject());
//        jsonObject.add("Statistic", new JsonArray());
//
//        System.out.println(jsonObject);


        List<String> friends = Arrays.asList("Alan", "Aajay", "AJan","Ave",
                "Rian");

//        friends.stream().map(name -> name.toUpperCase()).sorted()
//                .forEach(name -> System.out.print(name + " "));

        friends.stream().filter(s -> s.startsWith("A")).map(name -> name.toUpperCase())
                .sorted()
                .forEach(name -> System.out.println(name + " "));

    }


}
