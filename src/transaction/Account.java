package transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Khởi tạo một tài khoản mới.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Nạp tiền vào tài khoản.
     *
     * @param amount Số tiền cần nạp.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        this.balance += amount;
    }

    /**
     * Rút tiền từ tài khoản.
     *
     * @param amount Số tiền cần rút.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        this.balance -= amount;
    }

    /**
     * Thêm giao dịch vào tài khoản.
     *
     * @param amount    Số tiền giao dịch.
     * @param operation Loại giao dịch.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equalsIgnoreCase(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else if (operation.equalsIgnoreCase(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In ra danh sách các giao dịch đã thực hiện.
     */
    public void printTransaction() {
        for (int i = 1; i <= transitionList.size(); i++) {
            System.out.println("Giao dich " + i + ": " + transitionList.get(i - 1).getInfo());
        }
    }

    public static void main(String[] args) {

    }
}
