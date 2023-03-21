package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void solicitarPrestamo() {
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.agregarSaldo(3000);
			cb.agregarSaldo(500);
			cb.retirarSaldo(1000);
			cb.agregarSaldo(800);
			cb.solicitarPrestamo(1000);
			cb.obtenerPrestamo();
		} catch (Exception e) {
		return;
		}

	}

}
