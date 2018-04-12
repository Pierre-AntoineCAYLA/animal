package animal.animals;

import animal.regime.Carnivore;
import animals.Animal;
import animals.Deplacer;

public class Hyene extends Animal {

	 Deplacer deplacer;
	//constructeur de la hyene et donne ses carcateristiques propres
	public Hyene(int age, float poids, float taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "hyene";
		this.regime = new Carnivore();
	}

	public void HyeneDeplacer() {
		this.deplacer = Deplacer.COURIR;
	}
}
