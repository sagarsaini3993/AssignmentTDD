
public class Yelling {
	
	public String scream(String name) {
		
		if (name == "") {
			return "Nobody is yelling";
		}
		
		else if (name == name.toUpperCase()) {
			return "PETER IS YELLING";
		}
		return name+" is yelling";
	}

}
