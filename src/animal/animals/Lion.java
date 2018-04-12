package animal.animals;

import animal.regime.Carnivore;
import animals.Animal;
import animals.Deplacer;

public class Lion extends Animal {

	Deplacer deplacer;

	public Lion() {
		this.age = 20;
		this.poids = 190.0f;
		this.taille = 1.80f;
		this.nom = "lion";
		this.regime = new Carnivore();
	}

	public void LionDeplacer() {
		this.deplacer = Deplacer.COURIRRE;
	}
}