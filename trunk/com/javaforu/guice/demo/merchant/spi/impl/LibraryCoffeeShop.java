package com.javaforu.guice.demo.merchant.spi.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;
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
public class LibraryCoffeeShop implements Shop {
    protected CoffeeMachine coffeeMachine;

    protected PaymentService paymentService;

    protected PaymentService bigTicketPaymentService;

    @Inject
    public LibraryCoffeeShop(CoffeeMachine coffeeMachine,
                             PaymentService paymentService,
                             @Named("big-ticket") PaymentService bigTicketPaymentService) {
        this.coffeeMachine = coffeeMachine;
        this.paymentService = paymentService;
        this.bigTicketPaymentService = bigTicketPaymentService;
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
                    String.format(
                            "Oops! That's [%f] not enough for a cup of coffee. It costs [%f]. But it's ok, you can pay us next week",
                            payment, price));
        }

        Coffee coffee = coffeeMachine.makeCoffee();
        paymentService.pay(price);
        System.out.printf("Thanks for the [%f] tip!%n", change);

        return coffee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LibraryCoffeeShop{");
        sb.append("%n    coffeeMachine=").append(coffeeMachine);
        sb.append("%n    paymentService=").append(paymentService);
        sb.append("%n    bigTicketPaymentService=").append(bigTicketPaymentService);
        sb.append("%n}");
        return String.format(sb.toString());
    }
}
