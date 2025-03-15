package coffee_shop;

// Фабрика для создания разных видов кофе
public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        }
    }
}
