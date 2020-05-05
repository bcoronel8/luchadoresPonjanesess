package torneoDeSumo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	List<Luchador> luchadores;
	List<Integer> dominantes;

	public Torneo() {
		luchadores = new ArrayList<Luchador>();
		dominantes = new ArrayList<Integer>();
	}

	public void agregarLuchador(Luchador luchador) {
		luchadores.add(luchador);
	}

	public List<Integer> generarDominantes() {
		int cantidadQueDomina = 0;
		inicializarDominantes();
		for (int i = 0; i < luchadores.size(); i++) {
			for (int j = 0; j < luchadores.size(); j++) {
				if (luchadores.get(i).domina(luchadores.get(j))) {
					dominantes.set(i, dominantes.get(i) + 1);
				}
			}
		}
		return dominantes;
	}

	private void inicializarDominantes() {
		for (int i = 0; i < luchadores.size(); i++) {
			dominantes.add(0);
		}

	}
}
