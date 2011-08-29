package com.javaforu.guice.demo.merchant.spi.impl;

import com.javaforu.guice.demo.merchant.spi.PaymentService;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.printf("Connecting...transmitting...approved [%f]!%n", amount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreditCardPaymentService");
        sb.append("{instance=").append(System.identityHashCode(this));
        sb.append('}');
        return sb.toString();
    }
}
