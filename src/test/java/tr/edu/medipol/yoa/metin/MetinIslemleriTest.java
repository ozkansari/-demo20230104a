package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest { 

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - On hazirliklar
		String orjinalMetin = "Uc tas hos     ho  saf  . . . ";
		
		// WHEN - Asil testi gerceklestir
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		// THEN - Kontroller
		assertEquals("Uctashoshosaf...", sonuc);
	}
	
	@Test
	public void testBosluklariTemizleNull() {
		// GIVEN - On hazirliklar
		String orjinalMetin = null;
		
		// WHEN - Asil testi gerceklestir
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		// THEN - Kontroller
		assertEquals("", sonuc);
	}
	
	@Test
	public void testBosluklariTemizleNew() {
		// GIVEN - On hazirliklar
		MetinIslemleri obje;
		
		// WHEN - Asil testi gerceklestir
		obje = new MetinIslemleri();
		
		// THEN - Kontroller
		assertNotNull(obje);
	}

}
