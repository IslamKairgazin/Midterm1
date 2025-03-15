package payment_gateway;

// Адаптер, чтобы FreedomBank работал с нашим кодом
public class FreedomBankAdapter {
    private FreedomBankAPI bankAPI;

    public FreedomBankAdapter(FreedomBankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void makeTransaction(double amount) {
        // Отправляем платеж в банк
        bankAPI.sendPayment(amount);
    }
}

// Имитация API банка (обычно у банка был бы свой API, который мы адаптируем)
class FreedomBankAPI {
    public void sendPayment(double amount) {
        System.out.println("Платеж на сумму " + amount + " отправлен через FreedomBank.");
    }
}
