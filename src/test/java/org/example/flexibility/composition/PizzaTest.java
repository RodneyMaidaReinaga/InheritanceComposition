package org.example.flexibility.composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void prepare() {
        //Arrange


        // Act


        // Assert


    }

    @Test
    void getDough() {
    }

    @Test
    void getIngredients() {
    }

    @Test
    void getBaker() {
    }

    @Test
    void getPrice() {
        //Arrange
        double expected = 5.0;
        IDough dough = new Dough();
        IBaker baker = new Baker();
        IPriceCalculator priceCalculator = new PriceCalculator();
        List<IIngredient> ingredients = new ArrayList<>();
        Pizza pizza = new Pizza(dough, baker, priceCalculator, ingredients);

        // Act
        double result = pizza.getPrice();

        // Assert
        Assertions.assertEquals(expected, result);
    }
}