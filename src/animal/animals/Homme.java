package animal.animals;

import animal.regime.Omnivore;
import animals.Animal;
import animals.Deplacer;

public class Homme extends Animal {

	Deplacer deplacer;

	public Homme() {
		this.age = 5;
		this.poids = 90.0f;
		this.taille = 1.20f;
		this.nom = "homme";
		this.regime = new Omnivore();
	}

	public void HyeneDeplacer() {
		this.deplacer = Deplacer.MARCHER;
	}
}