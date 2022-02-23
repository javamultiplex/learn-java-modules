package main;

import bar.Bar;

import java.lang.reflect.Constructor;

/**
 * @author Rohit Agarwal on 12/02/22 11:58 PM
 * @copyright www.javamultiplex.com
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Bar bar=new Bar();
        bar.bar();
        final Class<?> name = Class.forName("foo.Foo");
        final Object object = name.getDeclaredConstructor().newInstance();
        System.out.println(object);
    }
}
