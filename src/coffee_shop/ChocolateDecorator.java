package coffee_shop;

public class ChocolateDecorator implements Coffee {
    private Coffee coffee;

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 300; // Стоимость шоколада в тенге
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " с шоколадом";
    }
}
