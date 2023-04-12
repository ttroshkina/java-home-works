package ru.qiwi.pair;

public final class Pair<One, Two> {
    private final One first;
    private final Two second;

    private Pair(One first, Two second) {
        this.first = first;
        this.second = second;
    }

    public static <One, Two> Pair<One, Two> of(One first, Two second) {
        return new Pair<>(first, second);
    }

    public One getFirst() {
        return first;
    }

    public Two getSecond() {
        return second;
    }

    public boolean equals(Pair<One, Two> pair) {
        return this.first == pair.getFirst() && this.second == pair.getSecond();
    }
}
