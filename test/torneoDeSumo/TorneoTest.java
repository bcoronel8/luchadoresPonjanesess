package torneoDeSumo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TorneoTest {

	@Test
	public void casoEnunciado() throws FileNotFoundException {
		List<Integer> resultadoEsperado = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 6, 3, 3, 2, 5, 0, 0));
		Torneo torneo = ProcesadorArchivo.lecturaYCarga("sumo.in");
		List<Integer> resultadoActual = torneo.generarDominantes();
		ProcesadorArchivo.escritura("sumo.out", resultadoActual);
		assertEquals(resultadoEsperado, resultadoActual);
	}
}
