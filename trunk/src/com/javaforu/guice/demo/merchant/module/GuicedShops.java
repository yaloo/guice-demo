package com.javaforu.guice.demo.merchant.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class GuicedShops {
    protected static Injector shop1;

    protected static Injector shop2;

    public static void $init() {
        CommerceModule commerceModule = new CommerceModule();

        shop1 = Guice.createInjector(
                Modules.override(commerceModule)
                        .with(new Library_GoodFilter_Cash_ShopModule()));

        shop2 = Guice.createInjector(commerceModule, new BigName_BadCappuccino_Card_ShopModule());
    }

    public static Injector $shop1() {
        return shop1;
    }

    public static <T> T $shop1(Class<T> klass) {
        return shop1.getInstance(klass);
    }

    public static Injector $shop2() {
        return shop2;
    }

    public static <T> T $shop2(Class<T> klass) {
        return shop2.getInstance(klass);
    }
}
