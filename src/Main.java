import coffee_shop.*;
import payment_gateway.*;
import java.util.Scanner;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Главное меню
        System.out.println("Добро пожоловать друг!!");
        System.out.println("Выберите,что хотите сделать:");
        System.out.println("1 - Оплатить");
        System.out.println("2 - Купить кофе");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер

        if (choice == 1) {
            processPayment(scanner);
        } else if (choice == 2) {
            orderCoffee(scanner);
        } else {
            System.out.println("Ошибка: неправильный выбор.");
        }

        scanner.close();
    }

    // Метод для оплаты
    private static void processPayment(Scanner scanner) {
        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Кредит карта");
        System.out.println("2 - FreedomBank");

        int paymentChoice = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер

        System.out.print("Введите сумму (в тенге): ");
        double amount = scanner.nextDouble();

        PaymentMethod payment;
        if (paymentChoice == 1) {
            payment = PaymentFactory.createPayment("creditcard");
        } else if (paymentChoice == 2) {
            payment = PaymentFactory.createPayment("freedombank");
        } else {
            System.out.println("Ошибка: неверный способ оплаты.");
            return;
        }

        payment.processPayment(amount);
        TransactionLogger.logTransaction("Оплачен платеж на сумму " + amount);
    }

    // Метод для заказа кофе
    private static void orderCoffee(Scanner scanner) {
        System.out.println("Выберите кофе:");
        System.out.println("1 - Латте");
        System.out.println("2 - Капучино");
        System.out.println("3 - Американо");

        int coffeeChoice = scanner.nextInt();
        scanner.nextLine();

        Coffee coffee;
        if (coffeeChoice == 1) {
            coffee = CoffeeFactory.createCoffee("latte");
        } else if (coffeeChoice == 2) {
            coffee = CoffeeFactory.createCoffee("cappuccino");
        } else if (coffeeChoice == 3) {
            coffee = CoffeeFactory.createCoffee("americano");
        } else {
            System.out.println("Ошибка: такого кофе нет.");
            return;
        }

        System.out.println("Хотите добавить что-то в кофе? (1 - да, 2 - нет)");
        int addToppings = scanner.nextInt();
        scanner.nextLine();

        if (addToppings == 1) {
            System.out.println("Выберите добавки (введите номера через пробел):");
            System.out.println("1 - Молоко");
            System.out.println("2 - Карамель");
            System.out.println("3 - Шоколад");

            String[] toppings = scanner.nextLine().split(" ");
            for (String topping : toppings) {
                if (topping.equals("1")) {
                    coffee = new MilkDecorator(coffee);
                } else if (topping.equals("2")) {
                    coffee = new CaramelDecorator(coffee);
                } else if (topping.equals("3")) {
                    coffee = new ChocolateDecorator(coffee);
                }
            }
        }

        // Выводим итоговый заказ
        System.out.println("Ваш заказ: " + coffee.getDescription());
        System.out.println("Итоговая цена: " + coffee.getCost() + "тенге");

    }
}
