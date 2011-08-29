package com.javaforu.guice.demo.merchant.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.javaforu.guice.demo.merchant.spi.CoffeeMachine;
import com.javaforu.guice.demo.merchant.spi.CoffeeType;
import com.javaforu.guice.demo.merchant.spi.PaymentService;
import com.javaforu.guice.demo.merchant.spi.Shop;
import com.javaforu.guice.demo.merchant.spi.impl.CashPaymentService;
import com.javaforu.guice.demo.merchant.spi.impl.CreditCardPaymentService;
import com.javaforu.guice.demo.merchant.spi.impl.GoodCoffeeMachine;
import com.javaforu.guice.demo.merchant.spi.impl.LibraryCoffeeShop;

/*
* Author: Ashwin Jayaprakash / Date: 8/22/11 / Time: 1:47 PM
*/
public class Library_GoodFilter_Cash_ShopModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PaymentService.class).to(CashPaymentService.class);

        bind(PaymentService.class).annotatedWith(Names.named("big-ticket")).to(CreditCardPaymentService.class);

        bind(Shop.class).to(LibraryCoffeeShop.class);
    }

    @Provides
    protected CoffeeMachine providesCoffeeMachine() {
        return new GoodCoffeeMachine(CoffeeType.filter);
    }
}
