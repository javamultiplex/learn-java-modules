package bil.service.impl;

import model.Invoice;
import bil.service.BillingService;

import java.util.List;

/**
 * @author Rohit Agarwal on 12/02/22 10:53 PM
 * @copyright www.javamultiplex.com
 */
public class BillingServiceImpl implements BillingService {
    @Override
    public List<Invoice> get() {
        return List.of(new Invoice("INV001", 10000));
    }
}
