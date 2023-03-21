package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void test1() {
		modificarCredito pal=new modificarCredito();
		asserEquols(true, pal.modificarCredito("1000"));
		}
	
	void test2() {
		modificarCredito pal=new modificarCredito();
		asserEquols(true, pal.modificarCredito("900"));
		}
	void test3() {
		modificarCredito pal=new modificarCredito();
		asserEquols(true, pal.modificarCredito("1000"))
		}

}
