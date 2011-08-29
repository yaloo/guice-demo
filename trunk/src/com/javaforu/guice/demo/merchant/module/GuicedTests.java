package com.javaforu.guice.demo.merchant.module;

import com.javaforu.guice.demo.merchant.spi.Coffee;
import com.javaforu.guice.demo.merchant.spi.Shop;

import static com.javaforu.guice.demo.merchant.module.GuicedShops.*;

/**
 * License: Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
 * <p/>
 * Author: Ashwin Jayaprakash
 * <p/>
 * Email: ashwin.jayaprakash@gmail.com
 * <p/>
 * Web: http://www.ashwinjayaprakash.com
 */
public class GuicedTests {
    public static void main(String[] args) {
        $init();

        //-------------

        Shop shop = $shop1(Shop.class);
        System.out.println("At shop: " + shop);

        Coffee coffee = shop.buyCoffee(10);
        System.out.println("Bought coffee: " + coffee);

        //-------------

        System.out.println();

        shop = $shop2(Shop.class);
        System.out.println("At shop: " + shop);

        coffee = shop.buyCoffee(10);
        System.out.println("Bought coffee: " + coffee);
    }
}
