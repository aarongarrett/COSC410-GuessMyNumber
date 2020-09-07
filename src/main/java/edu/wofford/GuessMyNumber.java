package edu.wofford;


public class GuessMyNumber {
    public enum Result { LOW, HIGH, EQUAL };

    public GuessMyNumber(int number) {
        target = number;
    }

    public int getTarget() {
        return target;
    }

    public Result guess(int g) {
        if (g < target) return Result.LOW;
        else if (g > target) return Result.HIGH;
        else return Result.EQUAL;
    }

    private int target;
}