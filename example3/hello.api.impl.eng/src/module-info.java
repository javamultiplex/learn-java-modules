import eng.impl.HelloApiEngImpl;
import service.HelloApi;

/**
 * @author Rohit Agarwal on 12/02/22 11:21 PM
 * @copyright www.javamultiplex.com
 */module hello.api.impl.eng {
     requires hello.api;
     provides HelloApi with HelloApiEngImpl;
}