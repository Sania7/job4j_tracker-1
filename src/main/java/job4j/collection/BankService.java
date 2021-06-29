package job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private Map<User, List<Account1>> users = new HashMap<>();
    /**
     * метод добавления пользователя в систему
     * @param user принимает на вход объект user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * метод должен добавить новый счет к пользователю
     * @param passport принимает на вход объект passport
     * @param account1 принимает на вход объект account1
     */
    public void addAccount(String passport, Account1 account1) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account1> userAccount = users.get(user);
            if (!userAccount.contains(account1)) {
                userAccount.add(account1);
            }
        }
    }

    /**
     * метод ищет пользователя по номеру паспорта
     * @param passport принимаемый на вход объект
     * @return метод возвращает true если клиент существует или false если нет
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
            }
        }
        return user;
    }

    /**
     * метод ищет счет пользователя по реквизитам
     * @param passport
     * @param requisite
     * @return
     */
    public Account1 findByRequisite(String passport, String requisite) {
        Account1 rslAccount = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account1> accounts = users.get(user);
            if (accounts != null) {
                for (Account1 account1 : accounts) {
                    if (account1.getRequisite().equals(requisite)) {
                        rslAccount = account1;
                        break;
                    }
                }
            }
        }
        return rslAccount;
    }
    /**
     * метод перечисления денег с одного счета на другой
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                  String destPassport, String destRequisite,
                                  double amount) {
        boolean rsl = false;
        Account1 srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account1 destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}
