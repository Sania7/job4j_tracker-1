package job4j.collection;

import java.util.Objects;

public class Account1 {
    private String requisite;
    private double balance;

    public Account1(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account1 account1 = (Account1) o;
        return Objects.equals(requisite, account1.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
