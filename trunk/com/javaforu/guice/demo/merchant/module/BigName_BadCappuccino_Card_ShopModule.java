package com.javaforu.guice.demo.merchant.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.javaforu.guice.demo.merchant.spi.CoffeeMachine;
import com.javaforu.guice.demo.merchant.spi.CoffeeType;
import com.javaforu.guice.demo.merchant.spi.Shop;
import com.javaforu.guice.demo.merchant.spi.impl.BadCoffeeMachine;
import com.javaforu.guice.demo.merchant.spi.impl.BigNameCoffeeShop;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class BigName_BadCappuccino_Card_ShopModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Shop.class).to(BigNameCoffeeShop.class);
    }

    @Provides
    protected CoffeeMachine providesCoffeeMachine() {
        return new BadCoffeeMachine(CoffeeType.cappuccino);
    }
}
