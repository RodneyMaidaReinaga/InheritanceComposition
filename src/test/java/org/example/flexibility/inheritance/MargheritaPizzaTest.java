package org.example.flexibility.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MargheritaPizzaTest extends BaseTest {

    @Test
    void prepare_WhenPizzaIsRequested_PrintsMessagesCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Tomato sauce");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Cheese");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Tomato");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.prepare();

        // Assert
        Assertions.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void getPrice_WhenPizzaPriceIsRequest_PizzaPriceIncludingIngredientsPrices() {
        // Arrange
        double expected = 17.0;
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        double result = pizza.getPrice();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void prepareDough() {
        //Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.prepareDough();

        // Assert
        Assertions.assertEquals(expectedOutput.toString(), getOutput());

    }

    @Test
    void bake() {
        //Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.bake();

        // Assert
        Assertions.assertEquals(expectedOutput.toString(), getOutput());
    }

}