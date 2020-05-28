package com.ensup.crypto.crypto;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;

public class DemoProviderSunJCE {

	public static void main (String[] args) {
		
		// 1. Obtenir un fournisseur de sécurité particulier
		Provider provider = Security.getProvider("SunJCE");
		
		// 2. Obtenir des informations sur ce fournisseur
		System.out.println("Services du provider "+ provider.getName());
		
		for (Service service : provider.getServices()) {
			System.out.println("\t" + service.getType() + " "+ service.getAlgorithm());
		}
	}
}