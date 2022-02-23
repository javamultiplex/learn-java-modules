import fr.impl.HelloApiFrImpl;
import service.HelloApi;

/**
 * @author Rohit Agarwal on 12/02/22 11:32 PM
 * @copyright www.javamultiplex.com
 */module hello.api.impl.fr {
     requires hello.api;
     provides HelloApi with HelloApiFrImpl;
}