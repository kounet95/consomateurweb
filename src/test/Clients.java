package test;

import java.rmi.RemoteException;

import service.Compte;
import service.ConversionProxy;

public class Clients {

	public static void main(String[] args) throws Throwable {
		ConversionProxy proxy = new ConversionProxy();
		System.out.println(proxy.conversionEuroEnDh(800));
		Compte compte = proxy.getcompte(2l);
		System.out.println(compte.getSolde());
		System.out.println(compte.getCondeCompte());
		Compte [] listCp = proxy.getComptes();
		for (Compte cp:listCp) {
			System.out.println(cp.getSolde());
			System.out.println(cp.getCondeCompte());
		}
	}

}
