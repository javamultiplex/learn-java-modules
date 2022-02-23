package eng.impl;

import service.HelloApi;

/**
 * @author Rohit Agarwal on 12/02/22 11:22 PM
 * @copyright www.javamultiplex.com
 */
public class HelloApiEngImpl implements HelloApi {
    @Override
    public void hello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
