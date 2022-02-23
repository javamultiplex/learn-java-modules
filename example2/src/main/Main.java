package main;

import del.service.DeliveryService;
import model.Invoice;

import java.util.List;

/**
 * @author Rohit Agarwal on 12/02/22 10:46 PM
 * @copyright www.javamultiplex.com
 */
public class Main {
    public static void main(String[] args) {
        final DeliveryService deliveryService = DeliveryService.build();
        final List<Invoice> invoiceList = deliveryService.deliver();
        System.out.println("Main -> " + invoiceList);
    }
}
