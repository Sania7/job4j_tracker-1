package job4j.ex;


// проверка с использованием блока if-else-throw
public class Config {
    public static void load(String path) {
        if (path != null) {
            System.out.println("Load config by " + path);
        } else {
            throw new IllegalStateException("Path could not by null.");
        }
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
