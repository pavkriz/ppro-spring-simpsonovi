package app;


import model.Osoba;
import model.Rodina;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import sluzby.Urad;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

		Osoba h = (Osoba) f.getBean("homer");
		System.out.println( h.toString() );
		
		Rodina r = (Rodina) f.getBean("rodinaHomeraAMarge");
		
		Urad soc = (Urad) f.getBean("socialniUrad");
		System.out.println( soc.zkontroluj(r) );
		
		Rodina r2 = (Rodina) f.getBean("rodinaAbrahamaAMony");

		Urad mat = (Urad) f.getBean("matrika");
		System.out.println( mat.zkontroluj(r2) );
		
		// doplnte kontrolu jedne z rodin pomoci FinancnihoUradu

	}
}
