package com.mycompany.formationspring.secondproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.formationspring.secondproject.controller.InvoiceController;
import com.mycompany.formationspring.secondproject.controller.InvoiceControllerMichel;

@SpringBootApplication
public class SecondProjectApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(SecondProjectApplication.class, args);
	
		System.out.println( "Quelle est votre configuration êtes-vous?" );
		Scanner sc =new Scanner(System.in);
		int configuration= sc.nextInt();
		if (configuration==1) {
			InvoiceController invoiceController = new InvoiceController();
			invoiceController.createInvoiceUsingController();
		} 
		else if(configuration==2){
			InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
			invoiceControllerMichel.createInvoiceUsingWebForm();
		}
	}

}
