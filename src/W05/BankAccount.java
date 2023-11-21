package W05;

public class BankAccount {

    static int ID = 1;
    public String name;
    int balance;
    private String password;

    public BankAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        BankAccount account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int newBalance) {
        if (newBalance < 0) {
            return;
        }
        this.balance = newBalance;
    }

    public String toString() {
        return "{ BankAccount: " + name + " | " + password + "}";
    }
}
