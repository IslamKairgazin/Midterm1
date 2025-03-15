package payment_gateway;

// Интерфейс для всех платежных методов (чтобы разные способы оплаты работали одинаково)
public interface PaymentMethod {
    void processPayment(double amount); // Метод для обработки платежа
}
