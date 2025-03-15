package coffee_shop;
// Класс для Капучино, реализует интерфейс Coffee
public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Капучино";
    }

    @Override
    public double getCost() {
        return 1400; // Цена в тенге
    }
}
