package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		setUp2();
		// TODO
		assertEquals(CAPACIDAD, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		setUp2();
		assertNotNull("No se agrego", modelo.buscar(CAPACIDAD-1));
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		setUp2();
		assertEquals(modelo.buscar(CAPACIDAD-1),new Integer(CAPACIDAD-1));
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		modelo.eliminar(1);
		assertNull("No se elimino correctamente", modelo.buscar(1));
		// TODO Completar la prueba
		
	}

}
