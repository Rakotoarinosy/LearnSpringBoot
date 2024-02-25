package com.mycompany.formationspring.secondproject.service;

import com.mycompany.formationspring.secondproject.entity.Invoice;
import com.mycompany.formationspring.secondproject.repository.InvoiceRepository;

public class InvoiceService {

    private static long lastNumber=0L;

    private InvoiceRepository invoiceRepository=new InvoiceRepository();

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
    
}
