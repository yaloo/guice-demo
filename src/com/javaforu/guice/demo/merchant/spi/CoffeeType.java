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
public enum CoffeeType {
    filter {
        @Override
        public double getPrice() {
            return 1.20;
        }
    },
    cappuccino {
        @Override
        public double getPrice() {
            return 3.50;
        }
    };

    public abstract double getPrice();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoffeeType");
        sb.append("{name=").append(name());
        sb.append(", price=").append(getPrice());
        sb.append('}');
        return sb.toString();
    }
}
