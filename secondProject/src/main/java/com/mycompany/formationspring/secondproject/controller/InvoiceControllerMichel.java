package com.mycompany.formationspring.secondproject.controller;


import com.mycompany.formationspring.secondproject.entity.Invoice;
import com.mycompany.formationspring.secondproject.service.InvoiceServiceMichel;

public class InvoiceControllerMichel {
    
    public void createInvoiceUsingWebForm(){

        String customerName = "Tesla";
		Invoice invoice = new Invoice();
		invoice.setCustomerNumber(customerName);
        
		InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
		invoiceServiceMichel.createInvoice(invoice);
    }
}
