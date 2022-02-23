package main;

import service.HelloApi;

import java.util.ServiceLoader;

/**
 * @author Rohit Agarwal on 12/02/22 11:20 PM
 * @copyright www.javamultiplex.com
 */
public class Main {
    public static void main(String[] args) {
        final ServiceLoader<HelloApi> serviceLoader = ServiceLoader.load(HelloApi.class);
        serviceLoader.stream()
                .forEach(i->i.get().hello("Rohit"));
    }
}
