package bil.service;

import bil.service.impl.BillingServiceImpl;
import model.Invoice;

import java.util.List;

/**
 * @author Rohit Agarwal on 12/02/22 10:48 PM
 * @copyright www.javamultiplex.com
 */
public interface BillingService {
    List<Invoice> get();
    static BillingService build(){
        return new BillingServiceImpl();
    }
}
