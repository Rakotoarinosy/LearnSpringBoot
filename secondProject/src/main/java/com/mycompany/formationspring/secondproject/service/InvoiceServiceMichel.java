package com.mycompany.formationspring.secondproject.service;

import com.mycompany.formationspring.secondproject.entity.Invoice;
import com.mycompany.formationspring.secondproject.repository.InvoiceRepository;

public class InvoiceServiceMichel {
    
    private static long lastNumber=112L;

    private InvoiceRepository invoiceRepository=new InvoiceRepository();

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));
        invoiceRepository.create(invoice);
    }
}
