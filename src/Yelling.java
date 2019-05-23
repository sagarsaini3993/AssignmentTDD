
public class Yelling {
	
	public String scream(String[] name) {
		
		if (name[0] == "") {
			return "Nobody is yelling";
		}
		
		else if (name[0] == name[0].toUpperCase()) {
			return name[0]+" IS YELLING";			
		}
		
		else if (name.length == 2) {
			return name[0]+ " and " +name[1]+ " are yelling";
		}
		
		return name[0]+" is yelling";
	}

}
