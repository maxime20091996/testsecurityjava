package com.ensup.crypto.crypto;

import java.security.Provider;
import java.security.Security;

public class DemoProviders {

	public static void main (String[] args) {
		
		// 1. Obtenir la liste des providers pour cette version de JRE
		Provider[] providers = Security.getProviders();
		
		// 2. Obtenir des informations sur chaque Provider : Nom et version
		for (Provider provider : providers) {
			System.out.println("Provider : "+ provider.getName() +" version "+ provider.getVersion());
		}
	}
}
