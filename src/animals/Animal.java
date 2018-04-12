package animals;

public abstract class Animal {
	private Deplacer deplacer;
	private int age;
	private float poids;
	private float taille;
	private String nom;
    private Regime regime; 

	
	public Animal()
	{this.age=0;
	this.poids=0.0f;
	this.taille=0.0f;
	this.nom="";
	}
	
	
	public Deplacer getDeplacer() {
		return this.deplacer;
	}
	
	public Regime getRegime() {
		return this.regime;	
	}
	

}
