package payment_gateway;

// Реализация оплаты кредитной картой
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Здесь просто имитация успешной оплаты
        System.out.println("Оплата " + amount + " через кредитную карту прошла успешно.");
    }
}
