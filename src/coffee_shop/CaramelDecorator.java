package coffee_shop;

public class CaramelDecorator implements Coffee {
    private Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee; // Получаем базовый кофе
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 250; // Стоимость карамели в тенге
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " с карамелью";
    }
}
