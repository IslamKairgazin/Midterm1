package coffee_shop;

public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee; // Получаем базовый кофе
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 200; // Стоимость молока в тенге
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " с молоком";
    }
}
