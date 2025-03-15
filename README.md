# Midterm Project - Smart Payment & Coffee Shop Simulator

## Project Description
This project was developed for the **Midterm Exam**.  
It includes **two systems**:
1. **Payment System** - allows payments using **credit card** or **FreedomBank**.
2. **Coffee Shop Simulator** - the user can choose **coffee and add-ons**.

## Design Patterns Used
**Factory Method** – for creating payment and coffee objects.  
**Adapter** – for integrating with `FreedomBank`.  
**Decorator** – for adding ingredients to coffee.

## Coffee Prices (in Tenge)
- **Latte**: 1500 Tenge
- **Cappuccino**: 1400 Tenge
- **Americano**: 1200 Tenge
- **Add-ons**:
    - Milk: +200 Tenge
    - Caramel: +250 Tenge
    - Chocolate: +300 Tenge

## **Conclusion**

**This project was developed as part of the Midterm Exam and includes two main components: the payment system and the coffee shop simulator.**

**The first part** implements **payment processing** using a **credit card and FreedomBank**, applying the **Factory Method** and **Adapter** patterns for flexibility and ease of integration.

**The second part** is a **coffee shop simulation**, where the user can **choose a drink and add ingredients**. The **Decorator** pattern is used here, allowing **dynamic changes to the composition and price of the order**.

All prices **are converted to Tenge**.  
