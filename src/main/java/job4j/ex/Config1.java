package job4j.ex;

public class Config1 {
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not by null.");
        }
        System.out.println("Load config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
