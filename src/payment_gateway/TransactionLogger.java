package payment_gateway;

// Логгер для платежей, чтобы фиксировать, какие транзакции выполнялись
public class TransactionLogger {
    public static void logTransaction(String message) {
        System.out.println("[LOG]: " + message);
    }
}
