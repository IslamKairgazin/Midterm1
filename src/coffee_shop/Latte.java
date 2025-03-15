package coffee_shop;
// Класс для Латте, реализует интерфейс Coffee
public class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Латте";
    }

    @Override
    public double getCost() {
        return 1500; // Цена в тенге
    }
}
