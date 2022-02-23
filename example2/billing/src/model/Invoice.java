package model;

/**
 * @author Rohit Agarwal on 12/02/22 10:47 PM
 * @copyright www.javamultiplex.com
 */
public class Invoice {
    private final String code;
    private final double amount;

    public Invoice(String code, double amount) {
        this.code = code;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "code='" + code + '\'' +
                ", amount=" + amount +
                '}';
    }
}
