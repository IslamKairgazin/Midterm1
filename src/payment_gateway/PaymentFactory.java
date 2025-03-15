package payment_gateway;

// Фабрика, которая создает нужный платежный метод по названию
public class PaymentFactory {
    public static PaymentMethod createPayment(String type) {
        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("freedombank")) {
            return new FreedomBankPayment(new FreedomBankAdapter(new FreedomBankAPI()));
        } else {
            throw new IllegalArgumentException("Неизвестный способ оплаты");
        }
    }
}
