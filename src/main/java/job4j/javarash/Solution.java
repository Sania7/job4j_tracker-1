package job4j.javarash;

public class Solution {
    public static void main(String[] args) {
        String string = " Думаю, это будет новой фичей." +
                "Только не говорите 7 никому, 678 что она " +
                "возникла случайно.";
        System.out.println("Количество цифр в строке " + countDigits(string));
        System.out.println("Количество букв в строке " + countLetters(string));
        System.out.println("Количество пробелов в строке " + countSpaces(string));
    }
    public static int countDigits(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
