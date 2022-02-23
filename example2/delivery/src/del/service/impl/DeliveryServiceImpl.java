package del.service.impl;

import model.Invoice;
import bil.service.BillingService;
import del.service.DeliveryService;

import java.util.List;

/**
 * @author Rohit Agarwal on 12/02/22 10:51 PM
 * @copyright www.javamultiplex.com
 */
public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public List<Invoice> deliver() {
        BillingService billingService=BillingService.build();
        final List<Invoice> invoices = billingService.get();
        System.out.println(invoices);
        return invoices;
    }
}
