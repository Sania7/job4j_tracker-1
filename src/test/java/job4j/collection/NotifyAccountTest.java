package job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr", "43dsf234"),
                new Account("142", "Petr", "00000001")

        );
        HashSet<Account> expected = new HashSet<>(Arrays.asList(
                new Account("123", "Petr", "43dsf234"),
                new Account("142", "Petr", "00000001")
        ));
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }

}