package job4j.test4;
import org.junit.Test;
import ru.job4j.tracker.*;

import java.io.OutputStream;
import java.util.Iterator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//9. Написать тесты на StartUI. [#785 #117304]

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()),replacedName, "1"});
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker,actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }
    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu: " + System.lineSeparator() +
                "=== Exit ===" + System.lineSeparator()));
    }
    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(""));
        Input in = new StubInput(new String[] {"0", "1"});
        UserAction[] actions = {new FindAllAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ls = System.lineSeparator();
        String menu = "Menu:" + ls  + "1. === Exit ===" + ls;
        assertThat(out.toString(), is(item.getName() + menu +
                "=== Show all items ===" +
                 item.getName()  + ls + item +
                ls
                + menu + "=== Exit ===" + ls));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("0"));
        Input in = new StubInput(new String[]{"0",String.valueOf(item.getName()),"1"});
        UserAction[] actions = {
                new FindAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ls = System.lineSeparator();
        String menu = "Menu." + ls + "0. Find" + ls + "1. Exit" + ls;
        assertThat(out.toString(), is(item.getName() + menu +
                "=== Find items by name ===" +
                ls + "Name " + item.getName() + " id" + item.getId() + ls
                + menu + "=== Exit ===" + ls));
    }
    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(""));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new FindIdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ls = System.lineSeparator();
        String menu = "Menu: "  + ls + "1. === Exit ===" + ls;
        assertThat(out.toString(), is(item.getName() + menu +
                "=== Find item by id ===" +
                ls  + item.getName() + "," + item.getId() + ls
                + menu + "=== Exit ===" + ls));
    }
}