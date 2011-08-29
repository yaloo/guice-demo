package com.javaforu.guice.demo.merchant.module;

import com.google.inject.AbstractModule;
import com.javaforu.guice.demo.merchant.spi.PaymentService;
import com.javaforu.guice.demo.merchant.spi.impl.CreditCardPaymentService;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class CommerceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PaymentService.class).to(CreditCardPaymentService.class);
    }
}
