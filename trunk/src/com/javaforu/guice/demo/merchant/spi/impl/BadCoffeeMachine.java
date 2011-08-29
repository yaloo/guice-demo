package com.javaforu.guice.demo.merchant.spi.impl;

import com.javaforu.guice.demo.merchant.spi.Coffee;
import com.javaforu.guice.demo.merchant.spi.CoffeeMachine;
import com.javaforu.guice.demo.merchant.spi.CoffeeType;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class BadCoffeeMachine implements CoffeeMachine {
    protected CoffeeType coffeeType;

    public BadCoffeeMachine(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    @Override
    public Coffee makeCoffee() {
        return new Coffee(coffeeType, false);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BadCoffeeMachine");
        sb.append("{coffeeType=").append(coffeeType);
        sb.append('}');
        return sb.toString();
    }
}
