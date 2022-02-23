package del.service;

import del.service.impl.DeliveryServiceImpl;
import model.Invoice;

import java.util.List;

/**
 * @author Rohit Agarwal on 12/02/22 10:49 PM
 * @copyright www.javamultiplex.com
 */
public interface DeliveryService {
    List<Invoice> deliver();

    static DeliveryService build() {
        return new DeliveryServiceImpl();
    }
}
