package torneoDeSumo;

public class Luchador {

	private double peso;
	private double altura;

	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean domina(Luchador aComparar) {
		boolean retorno;
		if ((this.altura > aComparar.altura && this.peso > aComparar.peso)
				|| (this.peso == aComparar.peso && this.altura > aComparar.altura)
				|| (this.altura == aComparar.altura && this.peso > aComparar.peso)) {
			retorno = true;
		} else
			retorno = false;
		return retorno;
	}

}
