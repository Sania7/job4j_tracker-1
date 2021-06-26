package job4j.javarash;



public class Main {
    public static void main(String[] args) {
        String string = "I love Java !";
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.print(word );
        }
        System.out.println();
        String string1 = "Люблю, тебя, Петра, творенье, люблю";
        String[] words1 = string1.split(",");
        for (String s : words1) {
            System.out.println(s);
        }
    }
}
