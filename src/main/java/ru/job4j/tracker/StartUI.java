package ru.job4j.tracker;


// 9.1 Зависимость от System.out [#33568 #117291]
public class StartUI {

    private final Output out;
    public StartUI(Output out) {
        this.out = out;
    }
        public void init (Input input, Tracker tracker, UserAction[] actions) {
            boolean run = true;
            while (run) {
                this.showMenu(actions);
                int select = input.askInt("Select: ");
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        }
        private void showMenu (UserAction[] actions) {
            out.println("Menu: ");
            for (int i = 1; i < actions.length; i++) {
                out.println(i + ". " + actions[i].name());
            }
        }
        public static void main (String[]args){
            Output output = new ConsoleOutput();
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new CreateAction(output),
                    new CreateAction(output),
                    new FindAllAction(output),
                    new FindNameAction(output),
                    new FindIdAction(output),
                    new ReplaceAction(output),
                    new DeleteAction(output),
                    new ExitAction(output)
            };
            new StartUI(output).init(input, tracker, actions);
        }
    }

