package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Ordena;
import dic.Dicionario;

public class InsertionOrder {

	Ordena o;
	Dicionario d;

	@Before
	public void setup() {
		d = new Dicionario();
		o = new Ordena(d.construirDic());

	}

	@Test
	public void testOrderDescZulus() {
		o.ordenaInsercao();
		int expected = 0;
		int actual = o.indexOf("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

	@Test
	public void testOrderDescAardvark() {
		o.ordenaInsercao();
		int expected = d.size() - 1;
		int actual = o.indexOf("aardvark");
		assertTrue("Expected to find the word aadvark at " + expected
				+ ", but it was found at " + actual, actual == expected);	}

}
