package transaction;

import java.text.DecimalFormat;

public class Transaction {
    public static final String DEPOSIT = "DEPOSIT";
    public static final String WITHDRAW = "WITHDRAW";

    private String operation;
    private double amount;
    private double balance;

    /**
     * Khởi tạo một giao dịch mới.
     *
     * @param operation Loại giao dịch.
     * @param amount    Số tiền giao dịch.
     * @param balance   Số dư sau giao dịch.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Lấy loại giao dịch.
     *
     * @return Loại giao dịch.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Thiết lập loại giao dịch.
     *
     * @param operation Loại giao dịch.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Lấy số tiền giao dịch.
     *
     * @return Số tiền giao dịch.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Thiết lập số tiền giao dịch.
     *
     * @param amount Số tiền giao dịch.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Lấy số dư sau giao dịch.
     *
     * @return Số dư sau giao dịch.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Thiết lập số dư sau giao dịch.
     *
     * @param balance Số dư.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Lấy thông tin chi tiết về giao dịch.
     *
     * @return Chuỗi mô tả thông tin giao dịch bao gồm loại giao dịch, số tiền và số dư.
     */
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("####0.00");
        if (operation.equalsIgnoreCase(DEPOSIT)) {
            return "Nap tien $" + df.format(amount) + ". "
                    + "So du luc nay: $" + df.format(balance) + ".";
        } else if (operation.equalsIgnoreCase(WITHDRAW)) {
            return "Rut tien $" + df.format(amount) + ". "
                    + "So du luc nay: $" + df.format(balance) + ".";
        }
        return "";
    }
}
