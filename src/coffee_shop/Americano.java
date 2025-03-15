package coffee_shop;
// Класс для Американо, реализует интерфейс Coffee
public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Американо";
    }

    @Override
    public double getCost() {
        return 1200; // Цена в тенге
    }
}
