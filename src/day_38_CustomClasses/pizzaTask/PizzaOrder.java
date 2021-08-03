package day_38_CustomClasses.pizzaTask;

import OfficeHours_07_28_2021.ArraysListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        //add 30 medium size pizzas with 2 cheese toppings and two peperoni toppings

        for (int i = 1; i < 30; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('M',2,2);
            pizzas.add(pizza);
        }

        //add 80 large pizza with 3 cheese toppings and 4 pepperoni toppings
        for (int i = 1; i < 80; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('L',3,4);
            pizzas.add(pizza);
        }

        //add 38 small pizza with 2 cheese toppings and 1 pepperoni topping

        for (int i = 1; i < 38; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('S',2,1);
            pizzas.add(pizza);
        }

        double totalPrice = 0;
        System.out.println("Total Number of Pizzas: " +pizzas.size());

        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
