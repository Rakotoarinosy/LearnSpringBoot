package com.mycompany.formationspring.secondproject.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.formationspring.secondproject.entity.Invoice;

public class InvoiceRepository {
    
    private static List<Invoice> invoices =new ArrayList<>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerNumber());
    }

}
