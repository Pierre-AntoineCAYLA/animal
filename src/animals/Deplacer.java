package animals;

public enum Deplacer {

	COURIR(1, "Courir"), MARCHER(2, "Marcher"), SAUTER(3, "Sauter");

	int code;
	String label;

	Deplacer(int id, String value) {
		code = id;
		label = value;
	}

}
