package animals;

public enum Deplacer {

		
		COURIRRE(1, "Courirre"),
		MARCHER(2, "Marcher"),
		SAUTER(3, "Sauter");
			
			int code;
			String label;
			
			Deplacer(int id, String value){
				code=id;
				label=value;
			}
			public String toString() {
				return code+"-"+label;
			}
		}

