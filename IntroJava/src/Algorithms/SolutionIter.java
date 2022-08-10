package Algorithms;

import java.io.Reader;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class SolutionIter implements Iterable<Integer>{

    public SolutionIter(Reader inp){

    };

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

}
