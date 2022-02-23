package fr.impl;

import service.HelloApi;

/**
 * @author Rohit Agarwal on 12/02/22 11:32 PM
 * @copyright www.javamultiplex.com
 */
public class HelloApiFrImpl implements HelloApi {

    @Override
    public void hello(String name) {
        System.out.println("Holla " + name + "!");
    }
}
