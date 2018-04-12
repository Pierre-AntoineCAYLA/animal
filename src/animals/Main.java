package animals;

import java.util.Scanner;

import animal.aliment.Aliment;
import animal.aliment.Carotte;
import animal.aliment.Plante;
import animal.aliment.Steak;
import animal.animals.Homme;
import animal.animals.Hyene;
import animal.animals.Lapin;
import animal.animals.Lion;

public class Main {

	public static void main(String[] args) {
		
		int age;
		float poids;
		float taille;
		int aliment;
		
		System.out.println("quelle animal voulez-vous ? \n 1. Lion \n 2. Hyene \n 3. Lapin \n 4. Homme");
		Scanner sc = new Scanner(System.in);
		int animal = sc.nextInt();	
		
		
		switch(animal)		
		{
		case 1: System.out.println("age, poids, taille");
		age = sc.nextInt();
		poids = sc.nextFloat();
		taille=sc.nextFloat();
		Animal lion=new Lion(age, poids, taille);
		System.out.println(lion.nom +"\n"+lion.age +"ans\n"+ lion.poids +"kg\n"+ lion.taille+"m");
	    break;

	    
	    case 2: 
	    System.out.println("age, poids, taille");
		age = sc.nextInt();
		poids = sc.nextFloat();
		taille=sc.nextFloat();
		Animal hyene=new Hyene(age, poids, taille);
		System.out.println(hyene.nom +"\n"+hyene.age +"ans \n"+ hyene.poids +"kg \n" +hyene.taille+"m");
	    break;
	    
	    case 3: 
	    System.out.println("age, poids, taille");
	    age = sc.nextInt();
		poids = sc.nextFloat();
		taille=sc.nextFloat();
		Animal lapin=new Lapin(age, poids, taille);
		System.out.println(lapin.nom +"\n"+lapin.age +" ans \n"+ lapin.poids +"kg \n"+ lapin.taille+"m");
		break;
	    
	    case 4: 
	    System.out.println("age, poids, taille");
		age = sc.nextInt();
		poids = sc.nextFloat();
		taille=sc.nextFloat();
		Animal homme=new Homme(age, poids, taille);
		System.out.println(homme.nom +"\n"+homme.age +"ans\n"+ homme.poids +"kg\n"+ homme.taille+"m");
		}
		
		

	}

	}
