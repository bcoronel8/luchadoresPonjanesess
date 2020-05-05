package torneoDeSumo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProcesadorArchivo {

	public static Torneo lecturaYCarga(String pathFile) throws FileNotFoundException {
		Torneo torneo = new Torneo();
		Scanner entrada = new Scanner(new File(pathFile));
		entrada.useLocale(Locale.ENGLISH);

		int cantidadLuchadores = entrada.nextInt();

		while (entrada.hasNext()) {
			torneo.agregarLuchador(new Luchador(entrada.nextDouble(), entrada.nextDouble()));
		}

		entrada.close();
		return torneo;

	}

	public static void escritura(String pathFile, List<Integer> resultados) throws FileNotFoundException {
		PrintWriter salida = new PrintWriter(pathFile);

		for (int i = 0; i < resultados.size(); i++) {
			salida.println(resultados.get(i));
		}

		salida.close();
	}
}
