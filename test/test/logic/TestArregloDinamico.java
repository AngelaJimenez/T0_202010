package test.logic;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico<String> arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico<String>(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		assertNotNull("El arreglo no se creo correctamente.", arreglo);
	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
		assertNotNull("Deberia existir.", arreglo.buscar("1"));
		arreglo.eliminar("1");
		
		assertNull("El dato no deberia existir", arreglo.buscar("1"));
	}

}
