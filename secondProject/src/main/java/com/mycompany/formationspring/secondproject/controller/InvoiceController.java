package com.mycompany.formationspring.secondproject.controller;

import java.util.Scanner;

import com.mycompany.formationspring.secondproject.entity.Invoice;
import com.mycompany.formationspring.secondproject.service.InvoiceService;

public class InvoiceController {

    public void createInvoiceUsingController(){

		System.out.println( "What is the customer name ?" );
		Scanner sc =new Scanner(System.in);
		String customerName = sc.nextLine();
		Invoice invoice = new Invoice();
		invoice.setCustomerNumber(customerName);
        
		InvoiceService invoiceService = new InvoiceService();
		invoiceService.createInvoice(invoice);
    }
    
}
