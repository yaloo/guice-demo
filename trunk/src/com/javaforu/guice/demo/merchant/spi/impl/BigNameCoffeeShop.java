package com.javaforu.guice.demo.merchant.spi.impl;

import com.google.inject.Inject;
import com.javaforu.guice.demo.merchant.spi.*;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class BigNameCoffeeShop implements Shop {
    protected CoffeeMachine coffeeMachine;

    protected PaymentService paymentService;

    @Inject
    public BigNameCoffeeShop(CoffeeMachine coffeeMachine, PaymentService paymentService) {
        this.coffeeMachine = coffeeMachine;
        this.paymentService = paymentService;
    }

    @Override
    public CoffeeType getCoffeeType() {
        return coffeeMachine.getCoffeeType();
    }

    @Override
    public Coffee buyCoffee(double payment) {
        double price = coffeeMachine.getCoffeeType().getPrice();
        double change = payment - price;
        if (change <= 0) {
            throw new RuntimeException(
                    String.format("Sorry, that's [%f] not enough for a cup of coffee. It costs [%f]", payment, price));
        }

        Coffee coffee = coffeeMachine.makeCoffee();
        paymentService.pay(price);
        System.out.printf("Thank you....Next in line%n");

        return coffee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BigNameCoffeeShop{");
        sb.append("%n    coffeeMachine=").append(coffeeMachine);
        sb.append("%n    paymentService=").append(paymentService);
        sb.append("%n}");
        return String.format(sb.toString());
    }
}
