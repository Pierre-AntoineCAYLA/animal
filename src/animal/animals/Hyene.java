package animal.animals;

import animal.regime.Carnivore;
import animals.Animal;
import animals.Deplacer;

public class Hyene extends Animal {

	Deplacer deplacer;

	public Hyene() {
		this.age = 5;
		this.poids = 90.0f;
		this.taille = 1.20f;
		this.nom = "hyene";
		this.regime = new Carnivore();
	}

	public void HyeneDeplacer() {
		this.deplacer = Deplacer.COURIR;
	}
}
