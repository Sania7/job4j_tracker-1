package job4j.ex;


//0.5. Иерархия исключений и множественный catch. [#219368 #117318]
public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Cannot find element with this login");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((user.getUsername().length() < 3 || !(user.isValid()))) {
            throw new UserInvalidException("User isn`t valid!");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("P", true),
                new User("P Arsentev", true)
        };

        try {
            User user = findUser(users, "P Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access!");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}