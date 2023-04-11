package ru.qiwi.fortytwo;

public class FortyTwo extends Number implements Comparable<FortyTwo>, TheUltimateQuestionOfLifeTheUniverseAndEverything{
    private final int value = 42;

    public int compareTo(FortyTwo o) {
        return 0;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    public void getAnswer() {
        System.out.println(value);
    }
}
