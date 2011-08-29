package com.javaforu.guice.demo.merchant.spi;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public interface CoffeeMachine {
    CoffeeType getCoffeeType();

    Coffee makeCoffee();
}
