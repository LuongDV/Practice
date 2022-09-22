package Java8.FunctionalProgramming;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExamble {

    static CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Hello");

    static CompletableFuture<String> future = completableFuture
        .thenApply(s -> s + " World");


}
