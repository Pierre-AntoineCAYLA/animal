package animal.animals;

import animal.regime.Herbivore;
import animals.Animal;
import animals.Deplacer;

public class Lapin extends Animal {

	Deplacer deplacer;

	public Lapin() {
		this.age = 1;
		this.poids = 15.0f;
		this.taille = 0.20f;
		this.nom = "Lapin";
		this.regime = new Herbivore();
	}

	public void LapinDeplacer() {
		this.deplacer = Deplacer.SAUTER;
	}
}
