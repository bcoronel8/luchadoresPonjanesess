package torneoDeSumo;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo torneo = ProcesadorArchivo.lecturaYCarga("sumo.in");
		List<Integer> resultadoActual = torneo.generarDominantes();
		ProcesadorArchivo.escritura("sumo.out", resultadoActual);
	}
}
