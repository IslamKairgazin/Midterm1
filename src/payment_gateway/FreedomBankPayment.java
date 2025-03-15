package payment_gateway;

// Оплата через FreedomBank с использованием адаптера
public class FreedomBankPayment implements PaymentMethod {
    private FreedomBankAdapter adapter;

    public FreedomBankPayment(FreedomBankAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void processPayment(double amount) {
        // Вызываем адаптер, который отправит платеж в банк
        adapter.makeTransaction(amount);
    }
}
