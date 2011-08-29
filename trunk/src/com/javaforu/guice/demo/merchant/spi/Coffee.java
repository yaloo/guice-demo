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
public class Coffee {
    protected CoffeeType coffeeType;

    protected boolean goodCoffee;

    public Coffee(CoffeeType coffeeType, boolean goodCoffee) {
        this.coffeeType = coffeeType;
        this.goodCoffee = goodCoffee;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public boolean isGoodCoffee() {
        return goodCoffee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Coffee");
        sb.append("{coffeeType=").append(coffeeType);
        sb.append(", goodCoffee=").append(goodCoffee);
        sb.append('}');
        return sb.toString();
    }
}
