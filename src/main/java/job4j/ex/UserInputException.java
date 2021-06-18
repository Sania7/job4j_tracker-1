package job4j.ex;
/*
Создаем наследника от класса Exception c выводом сообщения
 */
public class UserInputException extends Exception{
    public UserInputException(String message) {
        super(message);
    }
}
