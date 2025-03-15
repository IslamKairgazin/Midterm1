package coffee_shop;

// Интерфейс для всех типов кофе (чтобы можно было добавлять ингредиенты)
public interface Coffee {
    double getCost(); // Цена кофе
    String getDescription(); // Описание кофе
}
