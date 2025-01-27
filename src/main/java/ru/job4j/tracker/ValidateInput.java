package ru.job4j.tracker;

    public class ValidateInput implements Input {
    private final Output out;
    private final Input input;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    private boolean isNumber(String value) {
        boolean rsl = true;
        char[] check = value.toCharArray();
        for (char num : check) {
            if (num < 48 || num > 57) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            String rsl = input.askStr(question);
                if (!isNumber(rsl)) {
                    System.out.println("Please, select menu items from 1 to 7.");
                    continue;
                }
                value = Integer.parseInt(rsl);
                invalid = false;
        } while (invalid);
        return value;
    }
}
