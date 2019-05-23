
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
		
		else if (name.length > 2) {
			String nam = "";
			System.out.println("nam" +nam +name.length);
			
			for (int i = 0; i <name.length; i++) {
			
				nam = nam + name[i];
				if(i<(name.length)-1)
				{
					nam = nam + " , ";
				}
				if(i==(name.length)-2)
				{
					nam = nam + " and ";
				}
				
			}return nam +" are yelling";
		}
		return name[0]+" is yelling";
	}

}
