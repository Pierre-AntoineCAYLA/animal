package animal.animals;

import animal.regime.Omnivore;
import animals.Animal;
import animals.Deplacer;

public class Homme extends Animal {

	Deplacer deplacer;

	//constructeur de l'homme et donne ses carcateristiques propres
	public Homme(int age, float poids, float taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "homme";
		this.regime = new Omnivore();
	}

	public void HyeneDeplacer() {
		this.deplacer = Deplacer.MARCHER;
	}
}