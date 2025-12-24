package az.edu.turing.module01.lesson18;

import java.util.Objects;

public class Account {
    private double balance;
    private String owner;

    public Account(double balance, String owner) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance can not be negative?");
        }
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "Account{balance=%s, owner='%s'}".formatted(balance, owner);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Account is finalized");
    }
}
