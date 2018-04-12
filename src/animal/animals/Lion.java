package animal.animals;

import animal.regime.Carnivore;
import animals.Animal;
import animals.Deplacer;

public class Lion extends Animal {

	Deplacer deplacer;
	
	//constructeur du lion et donne ses carcateristiques propres
	public Lion(int age, float poids, float taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "lion";
		this.regime = new Carnivore();
	}

	public void LionDeplacer() {
		this.deplacer = Deplacer.COURIR;
	}

}